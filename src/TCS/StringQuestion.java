package TCS;

import java.util.Arrays;

public class StringQuestion {
    public static boolean isPalindrome(String str) {

        if (str == null) return false;

        StringBuilder reverseS = new StringBuilder(str).reverse();
        return str.equals(reverseS.toString());
    }

    // Count number of vowels / consonants and white space
    public static void count(String str) {
        int vowels = 0, consonants = 0, space = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            } else if (c == ' ') {
                space++;
            }
        }
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("space: " + space);
    }

    // Find the ASCII Value of A character
    public static void value(char c) {
        System.out.println("The ASCII value is  : " + (int) c);
    }

    // Remove Vowels form string
    public static void removeVowels(String s) {
        StringBuilder str = new StringBuilder(s.toLowerCase());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }

    // Remove Space from string
    public static void removeSpace(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }

    // Remove characters from string except alphabets
    public static void removeChar(String s) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                str.append(c);
            }
        }
        System.out.println(str);
    }

    // Reverse String
    public static String reverse(String s){
        StringBuilder str = new StringBuilder();
        for(int i = s.length()-1;i >=0 ;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    // Remove brackets from a algebric equation
    public static String removeBrac(String s){
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c != '(' && c != ')'){
                str.append(c);
            }
        }
        return str.toString();
    }

    // sum of number in string
    public static int sumOfNumber(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int sum = 0;
        int currentNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the number mathematically to avoid string concatenation
                currentNum = currentNum * 10 + (ch - '0');
            } else {
                sum += currentNum;
                currentNum = 0;
            }
        }
        // Add the last number if the string ends with a digit
        return sum + currentNum;
    }

    // Function to print frequency of characters in a sorted string
    public static void printFrequency(String str) {
        char[] chars = str.toCharArray();

        // Sort the character array
        Arrays.sort(chars);

        char ch = chars[0]; // First character
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ch)
                count++;
            else {
                System.out.print(ch + "" + count + " ");
                ch = chars[i];
                count = 1;
            }
        }

        // Print the count of last character
        System.out.print(ch + "" + count + " ");
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("ABCBA"));

        count("My name is Dharmik");

        value('b');

        removeVowels("Dharmik");

        removeSpace("Dharmik Parakhiya");

        removeChar("DHArmik%#$#");

        System.out.println(reverse("Dharmik"));

        System.out.println(removeBrac("a+(b*c)-(d/e)"));

        System.out.println(sumOfNumber("12xyz5"));



    }
}
