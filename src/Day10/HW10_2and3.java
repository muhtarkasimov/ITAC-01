package Day10;

import java.lang.reflect.Array;
import java.util.Random;

public class HW10_2and3 {

    public static void main(String[] args) {
        Random random = new Random();

        int arrSize = 5;
        int minBound = 0;
        int maxBound = 10;

        int[] arr = new int[arrSize];

        System.out.println("Array: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(arr[i] + " ");
        }

        int minIndex = findMinIndex(arr);
        System.out.printf("\nMin element A[%d] = %d\n", minIndex, arr[minIndex]);

        int maxIndex = findMaxIndex(arr);
        System.out.printf("\nMax element A[%d] = %d\n", maxIndex, arr[maxIndex]);
    }

    static int findMinIndex(int[] arr) {
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int findMaxIndex(int[] arr) {
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
