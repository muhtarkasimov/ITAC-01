package Day07;

import java.util.*;
public class HW7_1 {
    public static void main(String[] args) {
        Random random = new Random();

        //changeable values
        int arraySize = 6;
        int minBound = 0;
        int maxBound = 5;

        //unchangeable values
        int[] arr = new int[arraySize];
        int indexN = -1;

        // initializing array and displaying it
        System.out.println("Array: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(arr[i] + " ");
        }

        //checking if there are similar values
        for (int i = 1; i < arraySize; i++) {
            if (arr[i - 1] == arr[i]) {
                indexN = i;
                break;
            }
        }

        System.out.println("\n");
        System.out.println("Are there any consecutive similar numbers ?");
        System.out.println( (indexN >= 0) ? "Yes, there are couple of: " + arr[indexN] + " :)" : "No, there aren't :(");
    }
}
