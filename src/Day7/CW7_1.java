package Day7;

import java.util.*;

public class CW7_1 {

    public static void main(String[] args) {
        //03.10.19
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //configure these values whatever you want
        int minBound = 0;
        int maxBound = 100;
        int arraySize = 10;

        //don't touch these
        int[] arr = new int[arraySize];
        int sum1 = 0;
        int sum2 = 0;
        int counter1 = 0;


        for (int i = 0; i < arr.length; i++) {
            //initializing array with random numbers
            arr[i] = random.nextInt(maxBound - minBound + 1 ) + minBound;

            //calculating [0, 49] and [50, 100] AVGs
            if (arr[i] < 50 ) {
                sum1 += arr[i];
                counter1++;
            } else {
                sum2 += arr[i];
            }
        }

        //displaying array
        for (int i : arr) {
            System.out.print( i + " ");
        }
        System.out.println("\n");

        //printing results
        System.out.printf("AVG[0, 49] = %.1f\n", sum1/(float)counter1);
        System.out.printf("AVG[50, 100] = %.1f\n", sum2/(float)(arr.length-counter1));
    }
}
