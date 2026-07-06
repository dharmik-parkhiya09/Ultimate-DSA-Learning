package TCS;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int []newArr = new int[arr.length+1];
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        // Array input at first position
//        for (int i = 1; i < newArr.length; i++) {
//            newArr[0] = n;
//            newArr[i] = arr[i-1];
//        }

        // Array input at kth position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos+1; i < newArr.length; i++) {
            newArr[pos] = n;
            newArr[i] = arr[i-1];
        }


        System.out.println(Arrays.toString(newArr));
    }
}
