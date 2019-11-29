package Day09;

import java.util.*;
public class HW9_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        sort3Numbers(a);
        for (int i : a) System.out.println(i);
    }

    static void sort3Numbers(int[] a) {
        Arrays.sort(a);
    }


}
