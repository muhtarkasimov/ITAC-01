package Day08;

import java.util.*;
public class HW8_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            boolean isOK = false;
            int num = i;
            while (num > 0) {

                //avoiding (dividing by zero) exception (for example 150)
                if (i % 10 == 0) break;

                if ((i % (num % 10)) == 0 ) {
                    isOK = true;
                } else {
                    break;
                }
                num /= 10;
                //avoiding zero inside of number (for example 105)
                // если не вписать "&& num > 0" то первые 9 чисел не выводятся
                if ( num % 10 == 0 && num > 0) {
                    isOK = false;
                } break;
            }
            if (isOK) System.out.print(i + " ");
        }
    }
}
