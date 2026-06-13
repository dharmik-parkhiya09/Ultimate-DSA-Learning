package leetcode;

public class leetcode_650 {
    public static int minSteps(int n) {
        if (n == 0 || n == 1) return 0;
        int copy = 1;
        int paste = 0;
        while (n != 1) {
            paste++;
            n--;
        }
        return paste + copy;
    }

    public static void main(String[] args) {
        System.out.println(minSteps(1));
    }
}
