import java.io.IOException;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a, b, ans;
        while (scan.hasNext()) {
            a = scan.nextLong();
            b = scan.nextLong();
            ans = a^b;

            System.out.println(ans);
        }
    }
}
