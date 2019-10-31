package Day8;

import java.util.*;
public class HW8_1 {
    public static void main(String[] args) {
        Random random = new Random();

        //changeable values
        int arraySize = 10;
        int minBound = 0;
        int maxBound = 20;

        //unchangeable values
        int[] arr = new int[arraySize];
        int min = maxBound, max = minBound;
        int minIndex = -1;
        int maxIndex = -1;

//        int[] arr = {20,20,20,20,20,20,20,20,20,20};
//        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        System.out.println("Array: ");
        for (int i = 0; i < arraySize; i++) {
            //initializing array
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;

            //displaying array
            System.out.print(arr[i] + " ");

            if (arr[i] >= max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.printf("\nMin element A[%d] = %d\n", minIndex,min);
        System.out.printf("Max element A[%d] = %d\n", maxIndex,max);
    }
}
