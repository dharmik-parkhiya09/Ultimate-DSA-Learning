import java.util.Arrays;

public class Main {

    public static int SecondLarge(int[] arr){
        Arrays.sort(arr);
        int n = 1;
        int max = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] < max){
                max = arr[i];
                n--;
            }
            if (n == 0){
                return max;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=  new int[] {1,2,3,4,5,5};
        int a = SecondLarge(arr);
        System.out.println(a);
    }
}
