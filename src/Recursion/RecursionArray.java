package Recursion;

import java.util.ArrayList;

public class RecursionArray {

    // Sorted Array - true or not
    public static boolean sort(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        return arr[index] < arr[index + 1] && sort(arr, index + 1);
    }

    // Linear Search
    public static int Linear_Search(int[] arr, int target, int index) {
        if (index == arr.length - 1)
            return -1;

        if (arr[index] == target)
            return index;
        else
            return Linear_Search(arr, target, index + 1);

    }

    // Find All Occurrence Index
    static ArrayList<Integer> list = new ArrayList<>();

    public static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1)
            return;

        if (arr[index] == target)
            list.add(index);

        findAllIndex(arr, target, index + 1);
    }

    // return ArrayList of Index
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);

        return findAllIndex(arr, target, index + 1, list);
    }

    // Return the list without passing the argument
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) return list;

        // this will contain answer for that function call only
        if (arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCall =  findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCall);
        return list;
    }

    //Rotated Binary Search
    public static int search(int [] arr, int target,int start,int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == target)  return mid;

        if (arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
               return  search(arr,target,start,mid - 1);
            }
            else{
                return search(arr,target,mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]){
            return  search(arr,target,mid + 1, end);
        }
        return search(arr,target,start, mid - 1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9};

        // Sorted Array - true or not
        System.out.println(sort(arr, 0));

        // Linear Search - index
        System.out.println(Linear_Search(arr, 3, 0));

        // Find All Occurrence Index
        int[] num = {1, 2, 3, 5, 3, 6, 4, 6};
        findAllIndex(num, 3, 0);
        System.out.println(list);

        // Return Array List
        ArrayList<Integer> ans =  findAllIndex(num, 3, 0, new ArrayList<>());
        System.out.println(ans);

        // Return the list without passing the argument
        System.out.println(findAllIndex2(num, 3, 0));

        // Rotated Binary Search
        int[] array = {5,6,7,8,9,1,2,3};
        System.out.println(search(array,8,0,array.length-1));

    }
}
