package Day30.CW30_2;

import Day30.CW30_1.EggProduceable;
import Day30.CW30_1.Swimable;

public class CW30_2 {

    public static void main(String[] args) {

        TurtleMakeable t1 = new Turtle("Leonardo", 15);
        Swimable t2 = new Turtle("Rafael", 14);

        Chicken chicken = new Chicken();

        Container container = new Container(t1, chicken);


    }
}
