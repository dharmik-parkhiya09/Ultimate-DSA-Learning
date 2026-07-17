package leetcode;

import java.util.Arrays;

public class leetcode_3867 {
    public static void gcdSum(int[] nums) {
        int max = nums[0];
        int[] prefixGcd = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGcd);

        int start = 0;
        int end = prefixGcd.length - 1;
        int sum = 0;
        while (start < end) {
            sum += gcd(prefixGcd[start], prefixGcd[end]);
            start++;
            end--;
        }
        System.out.println(sum);

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 4};
        gcdSum(nums);
    }
}


// MY Code
//package leetcode;
//
//import java.util.Arrays;
//
//public class leetcode_3867 {
//    public static long gcdSum(int[] nums) {
//
//        int max = nums[0];
//        int[] prefixGcd = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            max = Math.max(max, nums[i]);
//            prefixGcd[i] = gcd(nums[i], max);
//        }
//
//        Arrays.sort(prefixGcd);
//
//        int start = 0;
//        int end = prefixGcd.length - 1;
//
//        long sum = 0;
//
//        while (start < end) {
//            sum += gcd(prefixGcd[start], prefixGcd[end]);
//            start++;
//            end--;
//        }
//
//        return sum;
//    }
//    public static int gcd(int a, int b){
//        if (b == 0) return a;
//        else return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {3,6,2,8};
//        System.out.println(gcdSum(nums));
//    }
//}

