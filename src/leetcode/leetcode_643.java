package leetcode;

public class leetcode_643 {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avg = (double) sum / k;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            double newAvg = (double) sum / k;

            avg = Math.max(avg, newAvg);
        }
        return avg;
    }
}
