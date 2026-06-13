package Sorting_Searching;

public class Binary_Search {


    // Binary Search
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // Ceiling Function
    public static int ceiling(int[] nums, int target) {

        if (target > nums[nums.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if ( target < nums[mid]) {
                end = mid - 1;
            }
            else if ( target > nums[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println("Target Found in : "+binarySearch(arr,target));

        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int tar = 15;
        System.out.println("Ceiling Element is  : " +  ceiling(num,tar));



    }
}
