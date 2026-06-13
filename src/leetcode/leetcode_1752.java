package leetcode;

import java.util.Arrays;

public class leetcode_1752 {
        public static boolean check(int[] nums) {
            int x = 0;
            int n =  nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i+1)%n]){
                    x++;
                }
            }
            return x <= 1;

        }

}
