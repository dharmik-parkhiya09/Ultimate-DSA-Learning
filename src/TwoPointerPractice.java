import java.util.Arrays;

public class TwoPointerPractice {

    // 1 -> Find Pair With Target Sum
    public static boolean FindPair(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                return true;
            }
        }
        return false;
    }

    // 2 -> Count Pairs less than target
    public static int countPairs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum < target) {
                count += (end-start);
                start++;
            }
            else{
                end--;
            }
        }
        return count;
    }

    // 3-> Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }

    // 4 -> Squares of a Sorted Array
    public static int[] sortedArray(int[] nums){
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int index = nums.length-1;

        while(start<=end){
            if (Math.abs(nums[start]) > Math.abs(nums[end])){
                result[index] = nums[start] * nums[start];
                start++;
            }
            else{
                result[index] = nums[end] * nums[end];
                end--;
            }
            index--;
        }

        return result;
    }

    // 5 -> Container With Most Water
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;

        while (start < end) {
            int area = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(maxArea, area);
            if (height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
         // 1->
        System.out.print("Answer of 1 is : ");
        int[] arr1 = {1,2,4,6,10};
        int target1 = 8;
        System.out.println(FindPair(arr1, target1));

        // 2->
        System.out.print("Answer of 2 is : ");
        int[] arr2 = {1,2,3,4};
        int target2 = 6;
        System.out.println(countPairs(arr2, target2));

        // 3->
        System.out.print("Answer of 3 is : ");
        int[] nums3 = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums3));

        // 4->
        System.out.print("Answer of 4 is : ");
        int[] nums4 = {-4,-1,0,3,10};
        int[] result = sortedArray(nums4);
        System.out.println(Arrays.toString(result));

        // 5->
        System.out.print("Answer of 5 is : ");
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
