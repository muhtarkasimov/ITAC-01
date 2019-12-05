package Day34.CW34_2;

import java.util.ArrayList;

public class CW34_2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 100 ; i+=2) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 1; i < 100 ; i+=2) {
            list.add(i,i-1);
        }
        System.out.println(list);

    }
}
