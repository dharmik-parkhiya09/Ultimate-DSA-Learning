package leetcode;

public class leetcode_738 {
    public int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int len = chars.length;
        int marker = len;

        for (int i = len - 1; i > 0; --i) {
            if (chars[i - 1] > chars[i]) {
                chars[i - 1]--;
                marker = i;
            }
        }

        for (int i = marker; i < len; ++i) {
            chars[i] = '9';
        }

        return Integer.parseInt(new String(chars));

    }
}
