package Day21.HW21_2;

public class Alcohol extends Drink {

    double alcoholPercentage;

    public Alcohol() {}

    public Alcohol(double alcoholPercentage) {
        setAlcoholPercentage(alcoholPercentage);
    }

    public Alcohol(double value, double alcoholPercentage) {
        super.setValue(value);
        setAlcoholPercentage(alcoholPercentage);
    }

    public Alcohol(String name, double price, double value, double alcoholPercentage) {
        super.setName(name);
        super.setPrice(price);
        super.setValue(value);
        setAlcoholPercentage(alcoholPercentage);
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0) return;
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nAlcohol percentage: " + alcoholPercentage + " %";

        return s;
    }
}
