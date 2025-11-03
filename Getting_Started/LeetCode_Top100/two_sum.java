class solution{
    public static void main(String[] args){
        solution sol = new solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = sol.twosum(nums, target);
        System.out.println("Answer: " + result[0] + ", " + result[1]);
    }

    public int[] twosum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
    return new int[]{-1, -1};
    }
}