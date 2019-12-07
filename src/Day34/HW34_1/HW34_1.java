package Day34.HW34_1;

import java.util.ArrayList;

public class HW34_1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ветер с моря дул");
        list.add("Нагонял беду");
        list.add("И сказал ты мне");
        list.add("Больше не приду");

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i) + ", " + list.get(i).toLowerCase() + "\n";
            list.set(i, line);
        }

        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        System.out.println("-------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            if (countCharsNumber(list.get(i)) > 20) {
                list2.add(list.get(i));
                list.remove(i);
                i--;
            }
        }

        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        System.out.println("-------------------------------------");

        for (int i = 0; i <list2.size(); i++) {
            if (list2.get(i).toLowerCase().contains("и сказал ты мне")) {
                list2.remove(i);
                break;
            }
        }

        System.out.println("list2 = " + list2);

    }

    public static int countCharsNumber(String s) {
        s = s.toLowerCase();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'а' & s.charAt(i) <= 'я') {
                counter++;
            }
        }
        return counter;
    }
}
