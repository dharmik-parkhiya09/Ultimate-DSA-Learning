package leetcode;

public class leetcode_3783 {
    public int mirrorDistance(int n) {
        String s = String.valueOf(n);
        String reverse = new StringBuilder(s).reverse().toString();

        int reversed = Integer.valueOf(reverse);
        return Math.abs(reversed - n);
    }
}
