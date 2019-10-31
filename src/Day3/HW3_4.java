package Day3;

import java.util.*;

public class HW3_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //22.09.19
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a == b && b == c) {
            System.out.println(3);
        } else if (a==b || b==c || a==c) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
