package Recursion;

public class fibonacci {
    public static int fibo(int n, int a, int b) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int c = a + b;
        System.out.println(c);
        return fibo(n - 1, b, c);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibo(5, a, b);

    }
}
