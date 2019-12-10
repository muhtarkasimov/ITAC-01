package Day36.CW36_1;

public class Desktop extends AbstractPC {
    private int monitorDiagonal;

    public Desktop(double priceDrop, Brand model, double price, int monitorDiagonal) {
        super(priceDrop, model, price);
        this.monitorDiagonal = monitorDiagonal;
    }

    public int getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(int monitorDiagonal) {
        if (monitorDiagonal < 1) {
            System.out.println("desktop monitor diagonal setting error");
            return;
        }
        this.monitorDiagonal = monitorDiagonal;
    }
}
