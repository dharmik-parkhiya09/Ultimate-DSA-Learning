package leetcode;

public class leetcode_153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Math.min(nums[left], nums[right]);
        while(left < right){
            min = Math.min(min,Math.min(nums[left++], nums[right--]));
            if (left == right) {
                min = Math.min(min,nums[left]);
                break;
            }
        }
        return min;
    }
}
