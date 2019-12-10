package Day36.CW36_1;

import java.util.LinkedList;
import java.util.Random;

public class CW36_1 {

    public static void main(String[] args) {

        LinkedList<AbstractPC> pcs = new LinkedList<>();
        fillList(pcs, 100);

        int desktopsPrice = 0;
        int laptopsPrice = 0;
        int laptopsDPrice = 0;
        for (int i = 0; i < pcs.size(); i++) {
            if (pcs.get(i) instanceof Laptop) {
                laptopsPrice += pcs.get(i).getPrice();
                laptopsDPrice += pcs.get(i).getDiscountedPrice();
            } else {
                desktopsPrice += pcs.get(i).getPrice();
            }
        }


    }

    public static void fillList(LinkedList<AbstractPC> list, int amount) {
        Random random = new Random();

        for (int i = 0; i < amount; i++) {
            int model = random.nextInt(2);
            if (i < amount/2) {
                list.add(new Desktop(0,Brand.ASUS,100,27));
            } else {
                list.add(new Laptop(20,Brand.DELL,200));
            }
        }
    }
}
