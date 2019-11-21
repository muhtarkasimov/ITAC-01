package Day24.HW24_1;

public class Credit {
    private String id;
    private double sum;
    private int period;
    private double percent;

    static private int counter = 0;
    static private double totalSum = 0;

    public Credit(String id, double sum, int period, double percent) {
        setId(id);
        setSum(sum);
        setPeriod(period);
        setPercent(percent);
        counter++;
        totalSum += sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.equals("")) return;
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        if (sum <= 0) return;
        this.sum = sum;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        if (period <= 0) return;
        this.period = period;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        if (percent < 0) return;
        this.percent = percent;
    }

    public static int getCreditsAmount() {
        return counter;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static double getSumAVG() {
        return totalSum/counter;
    }
}
