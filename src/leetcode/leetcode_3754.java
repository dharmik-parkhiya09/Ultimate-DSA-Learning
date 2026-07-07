package leetcode;

public class leetcode_3754 {
    public long sumAndMultiply(int n) {
        long concat = 0;
        long sum = 0;
        long mul= 1;

        while(n > 0){
            int digit = n % 10;
            if (digit != 0){
                concat += digit * mul;
                mul *= 10;

                sum += digit;
            }
             n /= 10;
        }

        if (concat == 0) return 0;
        return concat * sum;

    }

}
