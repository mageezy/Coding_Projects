import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {
    public static void Main(String[] Args) {
        int[] nums = {-1,0,1,2,-1,-4}; //testing input
        threeSum ts = new threeSum();
        List<List<Integer>> ans = ts.sum(nums);
        System.out.print("3 sum solution: \n" + ans);
    }

    public List<List<Integer>> sum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //Arraylist for the answers to be saved in.
        for (int i = 0; i < nums.length; i++) { //Check each number once.
            int num1 = nums[i];
            for (int j = i+1; j < nums.length; j++) { //Don't need to check numbers indexed earlier in the list.
                int num2 = nums[j];
                for (int k = j+1; k < nums.length; k++) {
                    int num3 = nums[k];
                    if (num1 + num2 + num3 == 0) { // if all three sum to 0 then add to the answer list.
                        ans.add(Arrays.asList(num1,num2,num3));
                    }
                }
            }
        }
        return ans;
    }
    
}
