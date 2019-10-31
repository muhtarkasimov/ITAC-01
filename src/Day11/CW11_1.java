package Day11;

import java.util.*;
public class CW11_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        System.out.println(a);
        System.out.println();
        printNumbers(a);

    }

    static void printNumbers(int a){
        int[] arr;
        int temp = a;
        int size = 0;

        //counting
        while(temp > 0) {
            size++;
            temp /= 10;
        }
        //creating array
        arr = new int[size];

        //initializing array
        for (int i = 0; i < size; i++ ) {
            arr[i] = a % 10;
            a /= 10;
        }
        //printing reverse array
        for (int i = size-1; i >= 0; i-- ){
            System.out.println(arr[i]);
        }

    }
}
