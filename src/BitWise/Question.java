package BitWise;

public class Question {

    // Find that Even or Odd
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // Find Unique Element
    public static int uniqueElement(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }

    // find i-th bit in number
    public static int findBit(int n, int i) {
        return (n >> i) & 1;
    }

    // Magic Number :  5^x
    public static int MagicNumber(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }

    // No of Digits to the base b
    public static int noOfDigits(int n,int b) {
        int ans = (int)(Math.log(n) /  Math.log(b));
        return ans;
    }

    // Number of set bits in Number
    public static int setBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n -= (n & -n);
        }
        return count;
    }

    public static void main(String[] args) {

        // is ODD
        int n = 66;
        System.out.println(isOdd(n));

        // Unique Element
        int[] arr = {1,2,3,4,2,3,1,4,5};
        System.out.println( " Unique Element is : " +uniqueElement(arr));

        // Find Bit
        int num = 6;    // 0110
        System.out.println(findBit(num,1));

        // Magic Number
        int magic = 3;
        System.out.println(" Magic Number : " + MagicNumber(magic));

        // Find Number base b
        System.out.println(noOfDigits(10,2));

        // Number of Set Bits
        System.out.println("No. of Bits : " + setBits(45));
    }
}
