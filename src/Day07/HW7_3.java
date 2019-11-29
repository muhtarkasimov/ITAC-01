package Day07;

import java.util.*;
public class HW7_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();
        int minBound = 1;
        int maxBound = 100;

        //unchangeable values
        int[] arr = new int[arraySize];
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int ctr1 = 0, ctr2 = 0, ctr3 = 0; // ctr -> counter

        // initializing array
        System.out.println("Array: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(arr[i] + " ");

            if (arr[i] < 31) {
                sum1 += arr[i];
                ctr1++;
            } else if( arr[i] < 61) {
                sum2 += arr[i];
                ctr2++;
            } else {
                sum3 += arr[i];
                ctr3++;
            }
        }
        System.out.println("\n");

        System.out.printf("From 1 to 30 => %.3f, amount %d\n", sum1/(float)ctr1, ctr1);
        System.out.printf("From 31 to 60 => %.3f, amount %d\n", sum2/(float)ctr2, ctr2);
        System.out.printf("From 61 to 100 => %.3f, amount %d\n", sum3/(float)ctr3, ctr3);
    }
}
