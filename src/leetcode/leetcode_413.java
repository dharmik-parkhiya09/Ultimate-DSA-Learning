package leetcode;

public class leetcode_413 {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;

        int count = 0;
        int ans = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                count++;
                ans += count;
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
}
