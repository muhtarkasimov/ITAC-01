package Day09;

import java.util.*;
public class CW9_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        printAVG(a, b);

    }

    static void printAVG(int a, int b) {
        double avg = (a + b) / 2.0;
        print(avg);
    }

    static void print(String s) {
        System.out.println(s);
    }
    static void print(double d) {
        System.out.println(d);
    }
    static void print(int n) {
        System.out.println(n);
    }
}

