package Day05;

import java.util.*;
public class HW5_2 {
    public static void main(String[] args) {
        //29.09.19
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if ( a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        while (a <= b) {
            System.out.print((Math.abs(a) % 2 == 1) ? a + " " : "");
            a++;
        }
    }
}
