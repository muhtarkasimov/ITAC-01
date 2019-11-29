package Day08;

public class HW8_4 {
    public static void main(String[] args) {

        int total = 225;
        int counter = 1;
        System.out.println("    |15|17|21|23|25|\n--------------------");
        for (int k15 = 0; k15 <= total / 15; k15++) {
            for (int k17 = 0; k17 <= total / 17; k17++) {
                for (int k21 = 0; k21 <= total / 21; k21++) {
                    for (int k23 = 0; k23 <= total / 23; k23++) {
                        for (int k25 = 0; k25 <= total / 25; k25++) {
                            if (k15*15 + k17*17 + k21*21 + k23*23 + k25*25 == total) {
                                System.out.printf("%2s  |%2s|%2s|%2s|%2s|%2s|\n",
                                        counter, k15, k17, k21, k23, k25);
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("--------------------\n"
                + (counter-1) + " options in total :)");
    }
}
