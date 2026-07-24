package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_89 {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = 1 << n;
        for (int i = 0; i < num; i++) {
                ans.add(i ^ (i >> 1));
        }
        return ans;
    }
}
