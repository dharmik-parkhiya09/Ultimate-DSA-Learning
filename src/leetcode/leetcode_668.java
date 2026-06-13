package leetcode;

import java.util.Arrays;

public class leetcode_668 {
    public static int findKthNumber(int m, int n, int k) {
        int left =1;
        int right = m * n;
        while(left < right){
            int mid = left + (right - left) / 2;
            if (countElementsLessOrEqual(mid,m,n) >= k){
                right = mid;
            }
            else{
                left = mid + 1;
            }

        }
        return left;
    }
    private static int countElementsLessOrEqual(int target, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(target / i, n);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findKthNumber(3, 3, 5));

    }
}
