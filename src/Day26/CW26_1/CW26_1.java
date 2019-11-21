package Day26.CW26_1;

import java.awt.*;

public class CW26_1 {

    public static void main(String[] args) {
        Figure figure = new Figure(10, 10, "Black", true);

        System.out.println(figure.speak());

        Rectangle rectangle = new Rectangle(15, 15, "White", true, 30, 50);

        System.out.println();
        System.out.println(rectangle.speak());

        Rectangle square = new Rectangle(20,30,"Green",false, 30, 30);

        System.out.println();
        System.out.println(square.speak());

        System.out.println();
        System.out.println(Figure.getCounter());

    }
}
