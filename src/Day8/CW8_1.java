package Day8;

import java.util.*;
public class CW8_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        for (; a <= b; a++) {
            boolean isPrime = true;
            for (int k = 2; k < a; k++) {
                if (a % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(a + " ");
        }
    }
}

/*  ознакомились с двумерными массивами(матрица)
*   многоуровневые циклы for
*   как получить цисло 185 тримя другими 15, 17, 21 (делается через три цикла (i,j,k), и в конце if( i*15 + j*17 + k*21 == 185 )
*   
* */