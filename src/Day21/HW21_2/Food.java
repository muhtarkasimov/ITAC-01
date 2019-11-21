package Day21.HW21_2;

public class Food extends FoodStuff {

    double weight; //grams

    public Food() {}

    public Food(double weight) {
        setWeight(weight);
    }

    public Food(String name, double price, double weight) {
        super.setName(name);
        super.setPrice(price);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) return;
        this.weight = weight;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nWeight: " + weight;

        return s;
    }
}
