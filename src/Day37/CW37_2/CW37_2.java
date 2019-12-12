package Day37.CW37_2;

import java.util.ArrayList;

public class CW37_2 {

    public static void main(String[] args) {


        Cat c1 = new Cat(10, "Barsik");
        Cat c2 = new Cat(15, "Murka");
        Cat c3 = new Cat(10, "Barsik");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        ArrayList<Cat> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);

        if (list.contains(c1)) {
            System.out.println("list contains " + c1);
        }


    }
}
