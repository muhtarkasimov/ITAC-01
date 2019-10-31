package Day6;

import java.util.*;

public class HW6_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //03.10.19
        int a = scan.nextInt();
        int fact = 1;
        if (a > 0 && a < 10) {
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
            System.out.println(fact);
        } else {
            System.out.println("Ошибка неверные входные данные");
        }
    }
}