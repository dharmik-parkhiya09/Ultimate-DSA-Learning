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

    // Search Element in Range
    public static int binarySearch(int[] nums, int target,int start,int end) {
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

    // Order-Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
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

    // Floor Function
    public static int floor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    // Finding in range of Infinite Array
    public static int findInRange(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int temp =  end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(nums, target,start,end);
    }




    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println("Target Found in : "+binarySearch(arr,target));

        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int tar = 15;
        System.out.println("Ceiling Element is  : " +  ceiling(num,tar));
        System.out.println("Floor Element is  : "+ floor(num,tar));



    }
}
