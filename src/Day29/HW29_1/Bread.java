package Day29.HW29_1;

public class Bread implements Bakeable {

    private String breadName;
    private double weight;

    public Bread(String breadName, double weight) {
        this.breadName = breadName;
        this.weight = weight;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void bake() {
        System.out.println(weight + " grams of " + breadName + " is baked");
    }
}
