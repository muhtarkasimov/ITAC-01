package Day8;

import java.util.*;
public class HW8_2 {
    public static void main(String[] args) {
        Random random = new Random();

        //changeable values
        int arraySize = 10;
        int minBound = 0;
        int maxBound = 20;

        //unchangeable values
        int[] arr = new int[arraySize];
        int min = maxBound, max = minBound;
        int minCounter = 0;
        int maxCounter = 0;

        System.out.println("Array: ");
        for (int i = 0; i < arraySize; i++) {
            //initializing array
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;

            //displaying array
            System.out.print(arr[i] + " ");

            if (arr[i] >= max) max = arr[i];
            if (arr[i] <= min) min = arr[i];
        }

//        За такое баллы отняли бы ?
//        for (int i : arr) {
//            if (i == max) maxCounter++;
//            if (i == min) minCounter++;
//        }

        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == max) maxCounter++;
            if (arr[i] == min) minCounter++;
        }
        System.out.printf("\nMin element: %d, amount: %d\n", min,minCounter);
        System.out.printf("Max element: %d, amount: %d\n", max,maxCounter);
    }
}
