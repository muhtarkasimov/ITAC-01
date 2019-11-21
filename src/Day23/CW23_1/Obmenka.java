package Day23.CW23_1;

public class Obmenka {

    String name;
    // USD, EUR
    double[][] kursy = {{69.0,79.0},{70.0, 80.0}};
    int operation; // 0 - sell, 1 - buy
    int currency; // 0 - USD, 1 - EUR
    double sum;

    public double change(int sum, int currency, int operation) {
        return 0;
    }

    public Obmenka() {
    }

    public Obmenka(String name) {
        this.name = name;
//        this.operation = operation;
//        this.currency = currency;
//        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) return;
        this.name = name;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        if (operation != 0 || operation != 1) return;
        this.operation = operation;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        if (currency != 0 || currency != 1) return;
        this.currency = currency;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        if (sum <= 0) return;
        this.sum = sum;
    }
}
