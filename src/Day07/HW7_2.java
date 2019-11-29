package Day07;

import java.util.*;
public class HW7_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();
        int minBound = 1;
        int maxBound = 12;

        //unchangeable values
        int[] arr = new int[arraySize];
        String[] monthArr = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        // initializing array and displaying it
        System.out.println("Array: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arraySize; i++) {
            // if arr[i] => 1;
            // then 1 - "Jan" but monthArr[1] - "Feb"
            // so we doing this arr[i] => 1 - 1 = 0
            // so monthArr[0] => Jan
            System.out.print(monthArr[arr[i]-1] + " ");
        }
    }
}
