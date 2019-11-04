package Day21.CW21_1;

public class Baget extends Bread{
    double length;
    int cutsAmount;

    public Baget() {}

    public Baget(double length, int cutsAmount) {
        setLength(length);
        setCutsAmount(cutsAmount);
    }

    public Baget(double weight, double price, String produceCompany, double length, int cutsAmount) {
        super.setWeight(weight);
        super.setPrice(price);
        super.setProduceCompany(produceCompany);
        setLength(length);
        setCutsAmount(cutsAmount);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getCutsAmount() {
        return cutsAmount;
    }

    public void setCutsAmount(int cutsAmount) {
        this.cutsAmount = cutsAmount;
    }

    void cut() {
        System.out.println("Baget is зарубцован");
    }

    @Override
    void bake() {
        super.bake();
        System.out.println("Only in eco pack");

    }
}
