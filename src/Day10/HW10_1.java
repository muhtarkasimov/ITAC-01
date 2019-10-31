package Day10;
import java.util.*;
public class HW10_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isOK = false;
        int currency;
        double amount;
        int operation;

        System.out.println("Welcome to \"Muha & Co.'s Obmenka\"");
        boolean doAgain;
        do {
            do {
                System.out.println("Enter operation type: " +
                        "\n1. BUY\n2. SELL");
                operation = scan.nextInt();
                // 1. BUY 2.SELL

                System.out.println("Enter currency: " +
                        "\n1. USD" +
                        "\n2. EUR" +
                        "\n3. RUR" +
                        "\n4. KZT");
                currency = scan.nextInt();
                // 1. USD 2.EUR 3.KGS 4.KZT

                System.out.println("Enter amount: ");
                amount = scan.nextDouble();


                if (amount > 0 && currency > 0 && currency < 5 && operation > 0 && operation < 3) {
                    isOK = true;
                } else {
                    System.out.println("Inputs are incorrect. Please review them, and reenter)");
                }

            } while (!isOK);

            double result = changeMoney(currency, amount, operation);

            System.out.printf("%s %.2f soms\n",
                    (operation == 1) ? "To buy such amount you'll need" : "After selling you'll receive", result);

            if (result >= 200000) System.out.println("But we're not going to do this operation :P");

            System.out.println("\nYou want some more operations ?\n1. Yes\n2. No");
            doAgain = (scan.nextInt() == 1) ? true : false;

        } while (doAgain);
    }

    static double changeMoney(int currency, double amount, int operation) {
        double result = 0;
        double[] buy = {69, 78, 1, 0.33};
        double[] sell = {68, 77, 0.8, 0.25};
        // USD, EUR, KGS, KZT

        if (operation == 1) {
            result = amount * buy[currency-1];
        } else {
            result = amount * sell[currency-1];
        }
        return result;
    }
}
