package Day4;

import java.util.*;
public class HW4_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter float number to round it:");
        // if your localization is not US, enter double through comma (,)
        double number = scan.nextDouble();
        double end = number % 1.0;
//        System.out.println("end = " + end);
        number = (end >= 0.5) ? Math.ceil(number) : Math.floor(number);
        System.out.print("Rounded number: ");
        System.out.printf("%.0f",number);
    }
}
