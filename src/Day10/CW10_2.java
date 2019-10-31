package Day10;
import java.util.*;
public class CW10_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to \"Obmenka\"\nEnter currency: ");
        String currency = scan.nextLine();
        System.out.println("Enter amount: ");
        double amount = scan.nextDouble();

        System.out.printf("Poluchay %.2f som(s)\n", obmenka(currency, amount));
    }

    static double obmenka(String currency, double amount) {
        double rate;
        switch (currency) {
            case "USD": rate = 69.90; break;
            case "EUR": rate = 77.60; break;
            default: rate = 1;
        }
        return rate * amount;
    }

}
