public class rotated_search {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        rotated_search rs = new rotated_search();
        int result = rs.search(nums, target);
        System.out.println("result: " + result);
    }

    public int search(int[] nums, int target) {
        int index = -1;
        int first = 0;
        int last = nums.length;
        if (first == last && target == nums[first]) {
            index = first;
        }
        while (first < last) {
            int middle = (last+first)/2;
            if (target == nums[middle]) {
                index = middle;
                first = last;
            } else if (target == nums[first]) {
                index = first;
                first = last;
            }else if (target < nums[first] && target > nums[middle]) {
                first = middle+1;
            } else if (target > nums[first] && target < nums[middle]) {
                last = middle;
            } else if (target > nums[first] && target > nums[middle]) {
                if (target - nums[first] < target - nums[middle]) {
                    last = middle;
                } else { first = middle+1;}
            } else if (target < nums[first] && target < nums[middle]) {
                if (nums[first] - target < nums[middle] - target) {
                    first = middle+1;
                } else {last = middle;}
            }
        }
        return index;
    }
    
}
