package leetcode;


public class leetcode_869 {
    public boolean reorderedPowerOf2(int n) {
        char []arr = String.valueOf(n).toCharArray();
        return permute(arr,0);
    }

    public  boolean permute(char[] arr, int index) {

        if (index == arr.length) {
            if (arr[0] == '0')
                return false;

            int num = Integer.parseInt(new String(arr));

            return isPowerOfTwo(num);
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, index, i);
            if (permute(arr, index + 1))
                return true;
            swap(arr, index, i);
        }

        return false;
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
