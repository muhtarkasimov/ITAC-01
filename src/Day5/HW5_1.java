package Day5;

import java.util.*;
public class HW5_1 {
    public static void main(String[] args) {
        //29.09.19
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a <= b) {
            System.out.print((a % 2 == 0) ? a : " ");
            a++;
        }
    }
}
