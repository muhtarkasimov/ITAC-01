package Day30.CW30_2;

import Day30.CW30_1.EggProduceable;

public class Chicken implements EggProduceable {

    @Override
    public void makeEgg() {
        System.out.println("Chicken is made an egg");
    }
}
