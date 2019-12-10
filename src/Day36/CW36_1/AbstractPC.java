package Day36.CW36_1;

public abstract class AbstractPC {
    private double priceDrop;
    private Brand brand;
    private double price;

    public AbstractPC(double priceDrop, Brand brand, double price) {
        this.priceDrop = priceDrop;
        this.brand = brand;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice() {
        return price - (price * (priceDrop / 100));
    }

    public void setPrice(double price) {
        if (price < 1)  {
            System.out.println("abstract pc price setting error");
            return;
        }
        this.price = price;
    }

    public double getPriceDrop() {
        return priceDrop;
    }

    public void setPriceDrop(double priceDrop) {
        if (priceDrop < 0) {
            System.out.println("abstract pc price drop setter error");
            return;
        }
        this.priceDrop = priceDrop;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        return false;
    }
}
