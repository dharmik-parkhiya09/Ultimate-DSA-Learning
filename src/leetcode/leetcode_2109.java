package leetcode;


public class leetcode_2109 {
    public String addSpaces(String s, int[] spaces) {
        char[] result = new char[s.length() + spaces.length];
        int sIdx = 0, rIdx = 0;

        for (int space : spaces) {
            while (sIdx < space) {
                result[rIdx++] = s.charAt(sIdx++);
            }
            result[rIdx++] = ' ';
        }

        while (sIdx < s.length()) {
            result[rIdx++] = s.charAt(sIdx++);
        }

        return new String(result);
    }
}
