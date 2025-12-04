import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class threeSum {
    public static void main(String[] Args) {
        int[] nums = {-1,0,1,2,-1,-4}; //testing input
        threeSum ts = new threeSum();
        List<List<Integer>> ans = ts.sum(nums);
        System.out.println("3 sum solution: \n" + ans);
    }

    public List<List<Integer>> sum(int[] nums) {
        Arrays.sort(nums);
        //base case 1 not enough numbers
        if (nums.length < 3) return new ArrayList<>();
        //base case 2, all numbers are positive
        if (nums[0] > 0) return new ArrayList<>();
        //map for storing last index of a value
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sumMap.put(nums[i], i);
        }//list to store answers in
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {//fixed number to use with the map
            if (nums[i] > 0) break;//if all positive break the loop
            for (int j = i+1; j < nums.length-1; j++) {//second fixed number to use with map
                int target = -(nums[i] + nums[j]);//target for the hash map is the negative of the two others
                if (sumMap.containsKey(target) && (sumMap.get(target) > j)) {
                    List<Integer> set = new ArrayList<>(3);
                    set.add(nums[i]);//make an array of the answer to put into the ans array
                    set.add(nums[j]);
                    set.add(target);
                    ans.add(set);//add answer to the ans array
                }
                j = sumMap.get(nums[j]);//set j to last occurance of the number just used
            }
            i = sumMap.get(nums[i]);//set i to the last occurence of the number just used
        }
        return ans;
    }
    
}
