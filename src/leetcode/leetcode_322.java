package leetcode;

import java.util.Arrays;

public class leetcode_322 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int count = 0;
        int max = coins.length - 1;

        while (amount > 0 && max >= 0) {
            if (coins[max] <= amount) {
                amount -= coins[max];
                count++;
            } else {
                max--;
            }
        }

        return amount == 0 ? count : -1;
    }
}
