package Day34.CW34_1;

import java.util.ArrayList;

public class CW34_1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 == 0 || list.get(i) % 3 == 0) {
                list2.add(list.indexOf(list.get(i)));
            }
        }
        System.out.println(list2);

    }
}
