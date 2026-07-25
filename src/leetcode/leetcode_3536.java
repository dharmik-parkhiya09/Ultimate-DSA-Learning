package leetcode;

import java.util.Arrays;

public class leetcode_3536 {
    public static int maxProduct(int n) {
        int[] digits = String.valueOf(n)
                .chars()
                .map(c -> c - '0')
                .toArray();

        int length = digits.length-1;

        Arrays.sort(digits);
        return digits[length] * digits[length-1];
    }

    public static void main(String[] args) {
        int n = 124;
        System.out.println(maxProduct(n));
    }
}
