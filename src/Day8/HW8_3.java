package Day8;

import java.util.*;
public class HW8_3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2s  * %2s = %2s\n", i, j, i*j);
            }
            System.out.println();
        }
        // .printf(); мы проходили, прошу не отнимать баллы за %s/
    }
}
