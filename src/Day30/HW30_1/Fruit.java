package Day30.HW30_1;

public class Fruit extends AbstractFood implements Eatable {

    private boolean isSalty;

    public Fruit(String name, double caloriesPer100Gram, double weight, boolean isSalty) {
        super(name, caloriesPer100Gram, weight);
        setSalty(isSalty);
    }

    public boolean isSalty() {
        return isSalty;
    }

    public void setSalty(boolean salty) {
        isSalty = salty;
    }
}
