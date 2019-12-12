package Day37.CW37_4;

import java.util.ArrayList;
import java.util.List;

public class CW37_4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        initList(list);

        System.out.println(list);

        //...
    }

    public static void initList(List list) {
        //initing array with 400 ints 0-100
        int counter = 1;
        for (int i = 0; i < 400; i++) {
            if (counter == 101) {
                counter = 1;
            }
            list.add(counter);
            counter++;
        }
    }
}
