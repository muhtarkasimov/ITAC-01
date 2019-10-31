package Day3;

import java.util.*;

public class HW3_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //22.09.19
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();

        if ( a % b == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }

    }
}
