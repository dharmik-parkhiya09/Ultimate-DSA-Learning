package leetcode;

import java.util.Stack;

public class leetcode_682 {
    public static int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "D":
                    if (!stack.isEmpty()) {
                        stack.push(stack.peek() * 2);
                    }
                    break;
                case "+":
                    if (stack.size() >= 2) {
                        int top = stack.pop();
                        int newScore = top + stack.peek();
                        stack.push(top);      // Put the top back
                        stack.push(newScore); // Push the new sum
                    }
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }

    public static void main(String[] args) {
        int ans = calPoints(new String[]{"5","2","C","D","+"});
        System.out.println(ans);
    }
}
