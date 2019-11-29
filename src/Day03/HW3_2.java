package Day03;

import java.util.*;
public class HW3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c,d,e,f,k,p,g;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();
        e = scan.nextDouble();
        f = scan.nextDouble();
        k = scan.nextDouble();
        p = scan.nextDouble();
        g = scan.nextDouble();

        double result = ((a+b)*c+d*e/f)/(k+p*b/a+g)*4/5;
        System.out.printf("%.5f", result);
    }
}
