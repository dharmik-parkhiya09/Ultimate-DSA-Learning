package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode_414 {
    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Integer[] arr = set.stream()
                .sorted()
                .toArray(Integer[]::new);

        if (arr.length < 3) {
            return arr[arr.length - 1];
        }

        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
