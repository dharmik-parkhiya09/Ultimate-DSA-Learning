package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
// }

public class leetcode_103{
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null) return ans;
//
//        List<Integer> currAns = new ArrayList<>();
//
//        Stack<TreeNode> main = new Stack<>();
//        Stack<TreeNode> helper = new Stack<>();
//
//        int level = 0;
//        main.push(root);
//
//        while (main.size() > 0){
//            TreeNode curr = main.pop();
//            currAns.add(curr.val);
//
//            if (level == 0){
//                if (curr.left != null)  helper.push(curr.left);
//            }
//            if (level == 0){
//                if (curr.right != null)  helper.push(curr.right);
//            }
//            else{
//                    if (curr.right != null)  helper.push(curr.right);
//
//                    if (curr.left != null)  helper.push(curr.left);
//            }
//
//            if (main.size() == 0){
//                ans.add(currAns);
//                currAns = new ArrayList<>();
//                level = 1-level;
//
//                main = helper;
//                helper = new Stack<>();
//            }
//        }
//        return ans;
//    }
}

