package Day3;

import java.util.*;

public class HW3_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //find the sum from 1 to N
        int n = scan.nextInt();
        int sum = (n * (n + 1))/2;

        System.out.println(sum);
    }
}
