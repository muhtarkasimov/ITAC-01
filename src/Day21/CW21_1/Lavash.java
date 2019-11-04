package Day21.CW21_1;

public class Lavash extends Bread {
    double radius;

    public Lavash() {}

    public Lavash(double radius) {
        setRadius(radius);
    }

    public Lavash(double weight, double price, String produceCompany, double radius) {
        super.setWeight(weight);
        super.setPrice(price);
        super.setProduceCompany(produceCompany);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void bake() {
        super.bake();
        System.out.println("I am lavash and I've been rolled");
    }
}
