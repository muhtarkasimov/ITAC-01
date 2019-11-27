package Day30.HW30_1;

public class HW30_1 {

    public static void main(String[] args) {

        AbstractFood apple = new Fruit("Apple", 100, 100, false);
        AbstractFood banana = new Fruit("Banana", 200, 150, false);


        Monkey mamaMonkey = new Monkey();
        Monkey babyMonkey = new Monkey();

        mamaMonkey.setOnBackMonkey(babyMonkey);
        mamaMonkey.setThingInRightHand(apple);
        mamaMonkey.setThingInLeftHand(banana);

        mamaMonkey.eat(apple);
        mamaMonkey.eat(apple);
    }
}
