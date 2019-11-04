package Day21.CW21_1;

public class Lepeshka extends Bread {
    double radius;

    public Lepeshka() {
    }

    public Lepeshka(double radius) {
        setRadius(radius);
    }


    public Lepeshka(double weight, double price, String produceCompany, double radius) {
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

    public void lakirovat() {
        System.out.println("Lepeshka is lakerovan");
    }

    public void nanestiUzor() {
        System.out.println("Nanesen uzor to lepeshka");
    }
}
