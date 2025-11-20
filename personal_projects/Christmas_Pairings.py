"""This program will take a list of names and will give each person a random recipient for a secret santa or similar gift exchange.
This program will ensure that no one is paired with themselves or paired with the person giving a gift to them."""

import random #to randomize the pairings.
import sys #to recieve input from the user on the command line.

#variables for the program to use
names = [] #list of names to be filled by user.
pairings = {} #dictionary to hold the pairings.

#get the names from the user and add to the names list.
allNames = 0
print("Please enter the names of everyone who will be participating in the gift exchange, one at a time. " \
"when you are done, type done")
while allNames == 0: #continue asking for more names until the user is done.
    name = input("Enter a name: ")
    if name.lower() == "done":
        allNames = 1
    else:
        names.append(name.capitalize())#capitalize the first letter of each name for good looks

#confirm with the user that the names are correct.
print("Here are the names: ", names)
correct = input("Are these names correct? (y/n): ")
if correct.lower() != "y":
    print("Please restart the program and enter the names again.")
    sys.exit()

#shuffle the names to randomize the pairings.
random.shuffle(names)
for i in range(len(names)):#pair each person with the next person in the list, with the last wrapping around.
    pairings[names[i]] = names[i+1] if i < len(names)-1 else names[0]

#display the pairings to the user.
print("Here are the pairings:")
for giver, receiver in pairings.items():
    print(f"{giver} gives to {receiver}")

