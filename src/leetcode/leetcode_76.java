package leetcode;

public class leetcode_76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] need = new int[128];

        // Stored frequency of character in t
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int match = 0;

        int min = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (need[c] > 0) {
                match++;
            }

            need[c]--;

            while (match == t.length()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                need[leftChar]++;

                if (need[leftChar] > 0) {
                    match--;
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}
