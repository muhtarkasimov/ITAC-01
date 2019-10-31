package Day10;

import java.util.*;

public class CW10_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
//        int sum = digitSum(n);
        System.out.println(digitSum(n));
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 50) System.out.println("Sum is greater than 50!");
        return sum;
        // 10 digits - уже string
    }
}

// процедура - не возращает ничего
// функция   - возвращает обьект
// метод это и функция и процедура