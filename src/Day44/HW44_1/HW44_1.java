package Day44.HW44_1;

import java.util.*;

public class HW44_1 {

    public static void main(String[] args) {

        DB db = new DB();

//        В Java заполнить 2 ArrayListа с разными городами.
        ArrayList<Town> towns = db.getAllTowns();
        for(Town t : towns) {
            System.out.println(t);
            System.out.println();
        }

    }

}
