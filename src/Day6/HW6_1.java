package Day6;

import java.util.*;

public class HW6_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //03.10.19
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;

        System.out.println("Четные числа:");
        for(a = a; a <= b; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
                sum += a;
            }
        }
        System.out.printf("\n\nСумма чисел: %d", sum);
    }
}