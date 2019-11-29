package Day04;

import java.util.*;
public class HW4_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter float number to round it:");
        // if your localization is not US, enter double through comma (,)
        double number = scan.nextDouble();
        double end = number % 1.0;
//        System.out.println("end = " + end);
        if(end >= 0.5 ) {
            number = Math.ceil(number);
        } else {
            number = Math.floor(number);
        }
        System.out.print("Rounded number: ");
        System.out.printf("%.0f",number);
    }
}
