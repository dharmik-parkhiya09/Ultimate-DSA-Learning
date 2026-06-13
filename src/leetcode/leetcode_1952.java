package leetcode;

public class leetcode_1952 {
        public boolean isThree(int n) {
            int divisorCount = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisorCount++;
                }
            }
            return divisorCount == 3;
        }
    }

