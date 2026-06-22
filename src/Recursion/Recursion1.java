package Recursion;

import javax.sound.sampled.Line;

public class Recursion1 {

    public static void newLine() {
        System.out.println();
    }

    // Print N to 1
    public static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    // Print 1 to N
    public static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    // Product of n to 1 --> Factorial
    public static int productNto1(int n) {
        if (n <= 1) return 1;
        return n * productNto1(n - 1);
    }

    // Sum of n to 1
    public static int sumNto1(int n) {
        if (n <= 0) return 0;
        return n + sumNto1(n - 1);
    }

    // sum of digits
    public static int sumOfDigits(int n) {
        if (n <= 1) return 1;
        return sumOfDigits(n / 10) + n % 10;
    }

    // Product of Digits
    public static int productOfDigits(int n) {
        if (n % 10 == n) return n;
        return n % 10 * productOfDigits(n / 10);
    }

    // Reverse a Number Way-1
    public static void reverse(int n) {
        if (n == 0) return;
        int sum = 0;
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    // Reverse a Number Way-2
    public static int reverse2(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    // Palindrom Number
    public static boolean palindrom(int n) {
        return n == reverse2(n);
    }

    // Count Zeros
    public static int countZerosHelper(int n,int count){
        if (n == 0) return count;

        int rem = n % 10;
        if (rem == 0) return countZerosHelper(n / 10, count + 1);
        return countZerosHelper(n / 10, count);
    }

    public static int countZeros(int n){
        return countZerosHelper(n,0);
    }


    public static void main(String[] args) {
        int n = 5;
        printNto1(n);
        newLine();

        print1toN(n);
        newLine();

        System.out.println(productNto1(n));

        System.out.println(sumNto1(n));

        System.out.println(sumOfDigits(1234));

        System.out.println(productOfDigits(1234));

        System.out.println(reverse2(1234));

        System.out.println(palindrom(12321));

        System.out.println(countZeros(10301));


    }
}
