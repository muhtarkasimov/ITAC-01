package Day9;

import java.util.*;
public class CW9_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();
        printTire(n, s);
    }

    static void printTire(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}
