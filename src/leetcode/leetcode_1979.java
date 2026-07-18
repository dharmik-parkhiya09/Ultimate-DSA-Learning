package leetcode;

import java.util.Arrays;

public class leetcode_1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}
