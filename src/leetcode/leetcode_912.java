package leetcode;

import java.util.Arrays;

public class leetcode_912 {

        public int[] sortArray(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        private void quickSort(int[] nums, int low, int high) {
            if (low >= high) {
                return;
            }

            int pivot = nums[low + (high - low) / 2];
            int i = low;
            int j = high;

            while (i <= j) {
                while (nums[i] < pivot) {
                    i++;
                }

                while (nums[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j) {
                quickSort(nums, low, j);
            }

            if (i < high) {
                quickSort(nums, i, high);
            }
        }




    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int []ans = new leetcode_912().sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }


}
