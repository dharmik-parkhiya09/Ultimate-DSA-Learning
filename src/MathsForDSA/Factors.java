package MathsForDSA;

import java.util.ArrayList;

public class Factors {

    // O(n)
    public static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    public static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                }
                System.out.print(i + " " + n / i + " ");
            }
        }
    }

    // both time ans space will be sqrt(n)
    public static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        factor(20);
        System.out.println();
        factor2(20);
        System.out.println();
        factor3(20);
    }
}
