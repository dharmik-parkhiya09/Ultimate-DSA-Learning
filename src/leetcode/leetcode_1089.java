package leetcode;




public class leetcode_1089 {
    public static void duplicateZeros(int[] arr) {
        int[] arr2 = new int[arr.length];
        int i = 0,j = 0;
        while (i < arr.length && j < arr.length) {
            arr[j] = arr[i];

            if (arr[i] == 0) {
                j++;
                if (j < arr.length) {
                    arr2[j] = 0;
                }
            }
            i++;
            j++;
        }

        for (i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}
