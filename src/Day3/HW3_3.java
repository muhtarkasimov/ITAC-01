package Day3;

import java.util.*;

public class HW3_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //22.09.19
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
