package TCS;

public class Solution {
    public static boolean isPalindrom(String s) {
        int left = 0;

        String str = s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrom(s));
    }
}
