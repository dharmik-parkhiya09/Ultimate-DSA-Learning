package leetcode;

import java.util.Stack;

public class leetcode_43 {
    public static String multiply(String num1, String num2) {
        Stack<Integer> stack = new Stack<>();
        stack.add(Integer.parseInt(num1));
        stack.add(Integer.parseInt(num2));
        int result = stack.pop() * stack.pop();
        return String.valueOf(result);

    }
}
