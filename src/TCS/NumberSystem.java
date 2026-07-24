package TCS;

import java.util.*;

public class NumberSystem {

    // 1. Check if a number is palindrome or not
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        return num == reverseDigits(num);
    }

    // 2. Find all Palindrome numbers in a given range
    public static List<Integer> getPalindromesInRange(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) result.add(i);
        }
        return result;
    }

    // 3. Check if a number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 4. Prime numbers in a given range
    public static List<Integer> getPrimesInRange(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) result.add(i);
        }
        return result;
    }

    // 5. Check if a number is armstrong number or not
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        int power = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power);
            num /= 10;
        }
        return original == sum;
    }

    // 6. Check if a number is perfect number
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        return sum == num;
    }

    // 7. Even or Odd
    public static String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    // 8. Check whether a given number is positive or negative
    public static String checkSign(int num) {
        if (num > 0) return "Positive";
        if (num < 0) return "Negative";
        return "Zero";
    }

    // 9. Sum of first N natural numbers
    public static int sumOfNNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    // 10. Find Sum of AP Series
    public static double sumOfAP(double a, double d, int n) {
        return (n / 2.0) * (2 * a + (n - 1) * d);
    }

    // 11. Program to find sum of GP Series
    public static double sumOfGP(double a, double r, int n) {
        if (r == 1) return a * n;
        return a * (1 - Math.pow(r, n)) / (1 - r);
    }

    // 12. Greatest of two numbers
    public static int greatestOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    // 13. Greatest of three numbers
    public static int greatestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 14. Leap Year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 15. Reverse digits of a number
    public static int reverseDigits(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // 16. Maximum and Minimum digit in a number
    public static Map<String, Integer> maxMinDigits(int num) {
        int max = 0, min = 9;
        num = Math.abs(num);
        if (num == 0) { max = 0; min = 0; }
        while (num > 0) {
            int digit = num % 10;
            if (digit > max) max = digit;
            if (digit < min) min = digit;
            num /= 10;
        }
        Map<String, Integer> res = new HashMap<>();
        res.put("Max", max);
        res.put("Min", min);
        return res;
    }

    // 17. Print Fibonacci upto Nth Term
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 18. Factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }

    // 19. Power of a number
    public static double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    // 20. Factors of a given number
    public static List<Integer> findFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors.add(i);
        }
        return factors;
    }

    // 21. Print all prime factors of the given number
    public static List<Integer> primeFactors(int num) {
        List<Integer> pFactors = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                if (!pFactors.contains(i)) pFactors.add(i);
                num /= i;
            }
        }
        return pFactors;
    }

    // 22. Check if a number is a strong number or not (Sum of factorial of digits equals number)
    public static boolean isStrongNumber(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return original == sum;
    }

    // 23. Check if a Number is Automorphic (Square ends with the number itself)
    public static boolean isAutomorphic(int num) {
        long square = (long) num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    // 24. GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 25. LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 26. Check if a number is Harshad number (Divisible by sum of its digits)
    public static boolean isHarshad(int num) {
        return num % sumOfDigits(num) == 0;
    }

    // 27. Check if the number is abundant number or not (Sum of proper factors > number)
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    // 28. Sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // 29. Sum of numbers in the given range
    public static int sumInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) sum += i;
        return sum;
    }

    // 30. Permutations in which N people can occupy R seats in a classroom (nPr)
    public static long permutations(int n, int r) {
        if (r > n) return 0;
        return factorial(n) / factorial(n - r);
    }

    // 31. Program to add two fractions
    public static void addFractions(int num1, int den1, int num2, int den2) {
        int commonDen = lcm(den1, den2);
        int finalNum = num1 * (commonDen / den1) + num2 * (commonDen / den2);
        int commonDiv = gcd(finalNum, commonDen);
        System.out.println("Result: " + (finalNum / commonDiv) + "/" + (commonDen / commonDiv));
    }

    // 32. Replace all 0s with 1s in a given integer
    public static int replaceZerosWithOnes(int num) {
        String s = String.valueOf(num).replace('0', '1');
        return Integer.parseInt(s);
    }

    // 33. Can a number be expressed as a sum of two prime numbers
    public static boolean canExpressAsSumOfTwoPrimes(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                return true;
            }
        }
        return false;
    }

    // 34. Calculate the area of circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 35 & 36. Program to find roots of a Quadratic Equation
    public static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Real and Distinct Roots: " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("Real and Equal Root: " + r1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex Roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }

    // 37 -> Neon Number
    public static boolean isNeonNumber(int n){
        if (n <= 1){
            return true;
        }

        int sum = 0;

        int square = n * n;
        while(square > 0){
            sum +=  square % 10;
            square /= 10;
        }

        if (sum == n){
            return true;
        }
        return false;
    }

    // 38 ->  spy number
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {
        // Demonstration of various functions
        System.out.println("--- Java Number Logic Examples ---");
        System.out.println("Is 121 Palindrome? " + isPalindrome(121));
        System.out.println("Primes between 10 and 30: " + getPrimesInRange(10, 30));
        System.out.println("Is 153 Armstrong? " + isArmstrong(153));
        System.out.println("Is 28 Perfect? " + isPerfect(28));
        System.out.println("GCD of 48 and 18: " + gcd(48, 18));
        System.out.println("LCM of 48 and 18: " + lcm(48, 18));
        System.out.println("Roots of x^2 - 5x + 6 = 0: ");
        solveQuadratic(1, -5, 6);

        System.out.println( " is Neon number " + isNeonNumber(11));
        System.out.println( " is Spy number " + isSpyNumber(15));

    }
}

