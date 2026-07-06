package TCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = takeMultipleInputWithoutScanner();

        printCommaSeparated(list, '{', '}');
        printCommaSeparated(list, '[', ']');

    }

    public static ArrayList<Integer> takeMultipleInput(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0  ; i < n; i++) {
            list.add(sc.nextInt());
        }

        return list;
    }

    public static ArrayList<Integer> takeMultipleInputWithoutScanner() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter size: ");
        int n = Integer.parseInt(br.readLine());

        System.out.print("Enter " + n + " numbers: ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }

            list.add(Integer.parseInt(st.nextToken()));
        }

        return list;
    }

    public static void printCommaSeparated(ArrayList<Integer> list, char openBracket, char closeBracket) {
        System.out.print(openBracket);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(closeBracket);
    }
}
