package Day06;

import java.util.*;

public class HW6_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //03.10.19

        int[] arr = new int[101];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            sum += arr[i];
        }

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( (i % 25 == 0) ? arr[i]+"\n": arr[i] + " ");
        }

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        System.out.printf("\nAVG: %.1f", sum / arr.length);
    }
}