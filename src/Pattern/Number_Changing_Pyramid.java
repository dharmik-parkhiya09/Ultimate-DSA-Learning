package Pattern;

public class Number_Changing_Pyramid {
    public static void main(String[] args) {
        int n = 4, num =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
