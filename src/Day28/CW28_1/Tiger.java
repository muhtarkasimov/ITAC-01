package Day28.CW28_1;

public class Tiger extends AbstractFeline {

    private int stripeCount;

    public Tiger(double weight, int age, String color, int clawsCount, double tailLength, int stripeCount) {
        super(weight, age, color, clawsCount, tailLength);
        this.stripeCount = stripeCount;
    }

    public Tiger(double weight, int age, String color, int stripeCount) {
        super(weight, age, color);
        this.stripeCount = stripeCount;
    }

    public int getStripeCount() {
        return stripeCount;
    }

    public void setStripeCount(int stripeCount) {
        this.stripeCount = stripeCount;
    }

    @Override
    public void sharpClaws() {
        System.out.println("Tiger is sharpening claws. Zn Zn");
    }

    @Override
    public void purr() {
        System.out.println("BRRRRRR BRRRRR BRRRR.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping now.");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating now.");
    }

    @Override
    public void makeSound() {
        System.out.println("ROOOOAR");
    }

    @Override
    public void haveARest() {
        makeSound();
        eat();
        sleep();
        purr();
    }
}
