package Day7;

import java.util.*;
public class CW7_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        //touch these
        int arrSize = 5;
        int maxBound = 5;
        int minBound = 0;

        //dont touch these
        int[] arr = new int[arrSize];
        boolean isX = false;

        System.out.println("Enter the number you want to find in array: ");
        int x = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.printf("A[%d] = %d\n", i, x);
                isX = true;
            }
        }

        System.out.print((isX)?"":"Nothing found :(\n");
    }
}
