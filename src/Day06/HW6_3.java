package Day06;

import java.util.*;

public class HW6_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //03.10.19
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (a = a; a <= b; a++) {
            System.out.print((a % 3 == 0) ? a+" ": "");
        }
    }
}