package Day34.CW34_1;

import java.util.ArrayList;

public class CW34_1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
