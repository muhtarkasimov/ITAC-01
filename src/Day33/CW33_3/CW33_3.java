package Day33.CW33_3;

import java.util.Scanner;

public class CW33_3 {

    public static void main(String[] args) throws WrongMonthException {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month < 1 || month > 12) {
            throw new WrongMonthException("Wrong month");
        }
        switch (month) {
            case 1:
                System.out.println("January");
        }
    }

    static class WrongMonthException extends Exception {
        public WrongMonthException(String message) {
            super(message);
        }
    }
}
