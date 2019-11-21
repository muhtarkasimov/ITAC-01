package Day28.CW28_1;

abstract public class AbstractFeline extends AbstractAnimal {

    private int clawsCount;
    private double tailLength;

    public AbstractFeline(double weight, int age, String color, int clawsCount, double tailLength) {
        super(weight, age, color);
        this.clawsCount = clawsCount;
        this.tailLength = tailLength;
    }

    public AbstractFeline(double weight, int age, String color) {
        super(weight, age, color);
    }

    public int getClawsCount() {
        return clawsCount;
    }

    public void setClawsCount(int clawsCount) {
        this.clawsCount = clawsCount;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public abstract void sharpClaws();

    public abstract void purr();


}
