package Day35.CW35_2;

import Day35.CW35_1.Cat;

import java.util.LinkedList;

public class CW35_2 {

    public static void main(String[] args) {

        LinkedList<Object> linkedList = new LinkedList<>();
        char c1 = 'Z';
        char c2 = 'a';
        int a = 1;
        for (int i = 0; i < 50; i++) {
            linkedList.add(new Cat(String.valueOf(c1),a));
            linkedList.add(new Dog(String.valueOf(c2),a+a));
//            c1++;
//            c2++;
//            a++;
        }

        System.out.println("linkedList = " + linkedList);

        LinkedList<Object> catMouseLinkedList = new LinkedList<>();
        int dogCounter = 0;
        int catCounter = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Cat) {
                if (catCounter == 5) {
                    catCounter = 0;
                    linkedList.remove(i);
                }
                catCounter++;
            }
            if (linkedList.get(i) instanceof Dog) {
                if (dogCounter == 3) {
                    linkedList.add(i+1, new Mouse());
                    dogCounter = 0;
                }
                dogCounter++;
            }
        }

        System.out.println("linkedList = " + linkedList);

        for (int i = 0; i < linkedList.size()-1; i++) {
            if (linkedList.get(i) instanceof Cat && linkedList.get(i+1) instanceof Mouse ||
                    linkedList.get(i) instanceof Mouse && linkedList.get(i+1) instanceof Cat) {
                catMouseLinkedList.add(linkedList.get(i));
                catMouseLinkedList.add(linkedList.get(i+1));
            }
        }

        System.out.println("linkedList = " + linkedList);
        System.out.println("catMouseLinkedList = " + catMouseLinkedList);
    }
}
