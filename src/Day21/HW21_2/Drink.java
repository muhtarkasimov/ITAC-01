package Day21.HW21_2;

public class Drink extends FoodStuff {

    double value; //liters

    public Drink() {}

    public Drink(double value) {
        setValue(value);
    }

    public Drink(String name, double price, double value) {
        super.setName(name);
        super.setPrice(price);
        setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < 0) return;
        this.value = value;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nValue: " + value + " liters";

        return s;
    }
}
