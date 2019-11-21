package Day21.CW21_1;

public class Bread {
    static int count = 0;
    double weight;
    double price;
    String produceCompany;

    public Bread() {}

    void bake() {
        System.out.println("Хлеб готов!");
    }

    void pack() {
        System.out.println("Хлеб упакован!");
    }

    public Bread(double weight, double price, String produceCompany) {
        setWeight(weight);
        setPrice(price);
        setProduceCompany(produceCompany);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduceCompany() {
        return produceCompany;
    }

    public void setProduceCompany(String produceCompany) {
        this.produceCompany = produceCompany;
    }
}
