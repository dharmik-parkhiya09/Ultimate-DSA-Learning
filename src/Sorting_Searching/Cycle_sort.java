package Sorting_Searching;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class Cycle_sort {

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int seconf) {
        int temp = arr[first];
        arr[first] = arr[seconf];
        arr[seconf] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
