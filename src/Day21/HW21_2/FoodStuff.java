package Day21.HW21_2;

public class FoodStuff {

    String name;
    double price;

    public FoodStuff() {}

    public FoodStuff(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) return;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) return;
        this.price = price;
    }

    @Override
    public String toString() {
        String s = "Food name is: " + name +
                "\nPrice is: " + price;

        return s;
    }
}
