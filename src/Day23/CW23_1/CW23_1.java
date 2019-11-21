package Day23.CW23_1;

import java.util.Scanner;

public class CW23_1 {

    //operation sell, buy
    //currency USD, EUR

    static Obmenka eObmenka = new EObmenka("Electro-Obmenka");
    static Obmenka rObmenka = new RObmenka("Real-Obmenka");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sum: ");
        int sum = scan.nextInt();

        System.out.println("Enter operation: \n0 - sell\n1 - buy");
        int operation = scan.nextInt();

        System.out.println("Enter currency: \n0 - USD\n1 - EUR");
        int currency = scan.nextInt();

        System.out.println(whichBetter(sum,currency,operation));


    }
    
    public static String whichBetter(int sum, int currency, int operation) {
        double eSum = eObmenka.change(sum,currency,operation );
        double rSum = rObmenka.change(sum,currency,operation );

        System.out.println("elec = " + eSum);
        System.out.println("real  = " + rSum);


        //67620
        //69000
//        if (operation == 1) { // buy
//            if (eSum < rSum) {
//                return "Real";
//            } else {
//                return "Electro";
//            }
//        } else { // sell
//            if (eSum < rSum) {
//                return "Elctro";
//            } else {
//                return "Real";
//            }
//        }
        return "S";
    }

}
