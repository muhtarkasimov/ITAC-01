package Day5;

import java.util.*;
public class HW5_4 {
    public static void main(String[] args) {
        //29.09.19
        Scanner scan = new Scanner(System.in);

        int a = 10000;

        while (a < 100000) {
            if (a % 133 == 125 && a % 134 == 111) {
                System.out.println(a);
            }
            a++;
        }

    }
}
