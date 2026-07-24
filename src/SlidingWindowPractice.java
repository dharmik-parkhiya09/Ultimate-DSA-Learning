public class SlidingWindowPractice {

    public static int maxSum(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        int left = 0;

        for (int right = k; right < nums.length; right++) {

            sum = sum - nums[left] + nums[right];

            max = Math.max(max, sum);

            left++;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
       int n =  maxSum(arr,3);
        System.out.println(n);

    }
}
