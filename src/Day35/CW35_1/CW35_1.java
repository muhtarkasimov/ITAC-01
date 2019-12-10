package Day35.CW35_1;

import java.util.ArrayList;

public class CW35_1 {

    public static void main(String[] args) {

        Cat c1 = new Cat("Murzik", 10);
        Cat c2 = new Cat("Bobik", 15);
        Cat c3 = new Cat("Barsik", 5);
        Cat c4 = new Cat("Leopold", 3);

        ArrayList<Cat> catList = new ArrayList<>();

        catList.add(c1);
        catList.add(c2);
        catList.add(c3);
        catList.add(c4);

        if (catList.contains(c1)) {
            System.out.println("Cat " + c1.getName() + " is found in list");
        }

        for (int i = 0; i < catList.size(); i++) {
            if (c1.getName().equals(catList.get(i).getName())) {
                System.out.println("Cat " + catList.get(i).getName() + " is in list at index " + catList.indexOf(catList.get(i)));
            }
            if (c4.getAge() == (catList.get(i).getAge())) {
                System.out.println("Cat with age " + catList.get(i).getAge() + " and name " + catList.get(i).getName() + " found in list at index " + i);
            }
        }

        Cat c5 = new Cat("Murzik", 10);

        System.out.println("c1.equals(c5) : " + c1.equals(c5));

        Cat[] catsArray;
        catList.toArray(catsArray = new Cat[catList.size()]);

        System.out.println("catsArray's cats: ");
        for (Cat c : catsArray) {
            System.out.println(c.getName());
        }


    }
}
