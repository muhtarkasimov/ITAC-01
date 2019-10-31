package Day4;

import java.util.*;
public class HW4_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month number to know it's season:");
        int monthNum = scan.nextInt();

        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall"); break;
            default:
                System.out.println("Input error. Please reenter number (1 - 12)"); break;
        }
    }
}
