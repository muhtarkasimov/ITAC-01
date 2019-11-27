package Day30.HW30_1;

public abstract class AbstractFood implements Eatable, Holdable {

    private String name;
    private double caloriesPer100Gram;
    private double weight; //grams

    public AbstractFood(String name, double caloriesPer100Gram, double weight) {
        setName(name);
        setCaloriesPer100Gram(caloriesPer100Gram);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) return;
        this.name = name;
    }

    public double getCaloriesPer100Gram() {
        return caloriesPer100Gram;
    }

    public void setCaloriesPer100Gram(double caloriesPer100Gram) {
        if (caloriesPer100Gram < 1) return;
        this.caloriesPer100Gram = caloriesPer100Gram;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 1 ) return;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Foodname: " + name +
                "\nWeight: " + weight +
                "\nCalories per 100 grams: " + caloriesPer100Gram + "\n";
    }
}
