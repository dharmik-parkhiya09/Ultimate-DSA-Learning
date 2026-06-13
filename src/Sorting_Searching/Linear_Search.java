package Sorting_Searching;

import java.util.Arrays;

public class Linear_Search {

    // Linear Search Element
    public static int LinearSearch(int[] nums,int target){
        for (int i = 0; i<nums.length; i++){
            if (nums[i]==target){
                return i;
            }
        }
        return -1;

    }

    // Search Minimum Element
    public static int FindMin(int[] nums){
        int min = nums[0];
        for (int i =1; i<nums.length; i++){
            if (nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }

    // Search Maximum Element
    public static int FindMax(int[] nums){
        int max = nums[0];
        for (int i =1; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

    // Search in 2D Array
    public static int[] search2DArray(int[][] nums,int target){
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length; col++){
                if (nums[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Search in range
    public static int SearchInRange(int[] nums,int target,int start,int end){
        if (nums.length==0){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    // Search In String
    public static boolean SearchInString(String s , char target){
        if (s.length()==0){
            return false;
        }
        for (char ch : s.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {3,1,6,7,5,2,9};
        System.out.println("Found in Index : "+ LinearSearch(arr,4));
        System.out.println("Minimum Element : " + FindMin(arr));
        System.out.println("Maximum Element : " + FindMax(arr));
        System.out.println("Searching for target : "+ SearchInRange(arr,7,1,4));

        int[][] nums = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int[] ans = search2DArray(nums,99);
        System.out.println("Index Position : " + Arrays.toString(ans));

        String s = "Dharmik";
        System.out.println("Found in String : " + SearchInString(s,'a'));
    }
}
