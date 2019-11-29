package Day02;

import java.util.*;

public class HW2_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int n1 = number / 100;
        int n2 = number % 100 / 10;
        int n3 = number % 10;

        System.out.println(n1 + ", " + n2 + ", " + n3);
    }
}