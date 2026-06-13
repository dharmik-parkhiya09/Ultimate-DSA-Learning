package leetcode;

public class leetcode_06 {
    public String convert(String s, int numRows) {
        String[] ans =  new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }
        int i = 0;
        while( i < s.length()) {
            for (int index =0; index < numRows && i<s.length(); index++) {
                ans[index] += s.charAt(i++);
            }
            for (int index = numRows - 2; index >= 0; index--) {
                ans[index] += s.charAt(i++);
            }
        }
        String result = "";
        for (String str : ans){
            result += str;
        }
        return result;
    }
}
