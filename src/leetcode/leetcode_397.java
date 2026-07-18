package leetcode;

public class leetcode_397 {
    public static int integerReplacement(int n) {

        long num = n;
        int count = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                if (num % 4 == 3 && num != 3) {
                    num += 1;
                } else {
                    num -= 1;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(integerReplacement(4));
    }
}
