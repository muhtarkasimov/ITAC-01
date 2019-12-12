package Day37.CW37_2;

import java.util.ArrayList;
import java.util.HashSet;

public class CW37_2 {

    public static void main(String[] args) {

        // U U U U - это ведра, hashset через итератор выбирает рандомный элемент и потом выводит через iterator.next()
        // если хэш коды одинаковые, то дальше сравниваются результаты оп .equals, если результаты по equals разные,
        // то элемент ложится в это же ведерко, но это два разных файла с одним хэш кодом, и это называется коллизия (столкновение)
        // эш кодов. (У каждого ведра есть свой хэш код) перебор разных файлов с одним хэш кодом происходит дальше со скоростью
        // O(n), n - количество элементов с одинаковым хэш кодом. Коллизия это не хорошо.


        Cat c1 = new Cat(10, "Barsik");
        Cat c2 = new Cat(15, "Murka");
        Cat c3 = new Cat(10, "Barsik");
        Cat c4 = new Cat(15, "Bobik");

        HashSet<Cat> set = new HashSet<>();

        System.out.println("adding cats c1 - c4");
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

        for (Cat c : set) {
            System.out.println(c);
        }


        System.out.println("set.size() = " + set.size());

        System.out.println();
        System.out.println("again adding cats c1 - c4");
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        for (Cat c : set) {
            System.out.println(c);
        }

        System.out.println("\nset.size() = " + set.size());
        System.out.println("nothing changed");


        ArrayList<Cat> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);

        System.out.println();
        if (list.contains(c1)) {
            System.out.println("list contains " + c1);
        }


    }
}
