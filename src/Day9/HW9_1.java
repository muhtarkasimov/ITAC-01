package Day9;

import java.util.*;
public class HW9_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        printNumber(n);

    }

    static void printNumber(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

}
