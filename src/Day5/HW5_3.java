package Day5;

import java.util.*;
public class HW5_3 {
    public static void main(String[] args) {
        //29.09.19
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int sum = 0;
        if (a > 0 && a < 1000000) {
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            System.out.println(sum);
        }
    }
}
