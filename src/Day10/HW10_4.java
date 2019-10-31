package Day10;

public class HW10_4 {

    public static void main(String[] args) {

        int sum1 = 0; //3
        int sum2 = 0; //4
        int divisor1 = 3;
        int divisor2 = 4;

        //сумма чисел кратных 3 ->  % 3 == 0 ->true

        sum1 = calculateSumByDivisor(divisor1);
        sum2 = calculateSumByDivisor(divisor2);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("total sum = " + (sum1 + sum2));

    }

    static int calculateSumByDivisor(int divisor) {
    int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % divisor == 0) {
                sum += i;
//                System.out.println("i = " + i);
//                System.out.println("sum = " + sum);
            }
        }

    return sum;
    }
}
