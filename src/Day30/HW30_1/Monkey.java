package Day30.HW30_1;

public class Monkey implements Climbing, Eating {

    Climbing onBackMonkey;
    Holdable thingInRightHand;
    Holdable thingInLeftHand;



    public Monkey() {
    }

    public Holdable getThingInRightHand() {
        return thingInRightHand;
    }

    public void setThingInRightHand(Holdable thingInRightHand) {
        this.thingInRightHand = thingInRightHand;
    }

    public Holdable getThingInLeftHand() {
        return thingInLeftHand;
    }

    public void setThingInLeftHand(Holdable thingInLeftHand) {
        this.thingInLeftHand = thingInLeftHand;
    }

    public Climbing getOnBackMonkey() {
        return onBackMonkey;
    }

    public void setOnBackMonkey(Climbing onBackMonkey) {
        this.onBackMonkey = onBackMonkey;
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing");
    }

    @Override
    public void eat(AbstractFood food) {
        if (isContainInHand(food) == 0) {
            System.out.println("Monkey has no " + food.getName() + " in his hands");
        } else if (isContainInHand(food) == 1) {
            System.out.println("Monkey is eating " + thingInRightHand.getClass().getName() + " from his right hand");
            thingInRightHand = null;
        } else if (isContainInHand(food) == 2) {
            System.out.println("Monkey is eating " + thingInLeftHand.getClass().getName() + " from his left hand");
            thingInLeftHand = null;
        }
    }

    private int isContainInHand(Holdable thing) {
        //0 - neither
        //1 - right
        //2 - left
        if (thingInRightHand.equals(thing)) {
            return 1;
        } else if (thingInLeftHand.equals(thing)) {
            return 2;
        } else {
            return 0;
        }
    }
}
