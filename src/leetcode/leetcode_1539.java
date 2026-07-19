package leetcode;

import java.util.Arrays;

public class leetcode_1539 {
    public int findKthPositive(int[] arr, int k) {
        int count = k;
        int i = 1;

        while (count > 0) {
            if (Arrays.binarySearch(arr, i) < 0) {
                count--;
            }
            if (count == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }


}
