public class missing_number {
    public static void main(String[] args) {
        int[] nums = {0,1};
        missing_number mn = new missing_number();
        int ans = mn.missingNumber(nums);
        System.out.println("ans: " + ans);
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = 0;
        int actualSum = 0;
        for (int i = 0; i <= n; i++) {
            expectedSum += i;
        }
        for (int j : nums) {
            actualSum += j;
        }
        int missingNum = expectedSum - actualSum;
        return missingNum;
    }
}
