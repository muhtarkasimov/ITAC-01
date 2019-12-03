package Day33.CW33_1;

import java.util.Scanner;

public class CW33_1 {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to know if it is square root:");
        int x = scan.nextInt();

        if (!isSquare(x)) throw new Error(x + " is not square root");
        else System.out.println(x + " is square root");
    }

    public static boolean isSquare(int x) {
        if (Math.sqrt(x) % 1 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
