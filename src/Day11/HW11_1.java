package Day11;

import java.util.Random;

public class HW11_1 {

    public static void main(String[] args) {
        Random random = new Random();

        int arrSize = 5;
        int minBound = 1;
        int maxBound = 5;

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(arr[i] + " ");
        }

        boolean isThere2SimNums = false;
        isThere2SimNums = checkIf2SimNums(arr);
        System.out.println("isThere2SimNums = " + isThere2SimNums);
    }

    static int getCount(int[] a, int X){
        int count =0;
        for(int i = 0; i < a.length; i++) {
            if (X == a[i]){
                count++;
            }
        }
        return count;
    }

    static boolean checkIf2SimNums(int[] arr) {
        boolean isIt = false;
        for (int i = 0; i < arr.length; i++) {
            //if 2 and only 2 similar ->
//            if (getCount(arr, i) == 2) {
            if (getCount(arr, arr[i]) >= 2) {
                isIt = true;
            }
        }

        return isIt;
    }
}
