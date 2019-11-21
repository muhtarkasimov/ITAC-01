package Day28.CW28_1;

public class Cow extends AbstractAnimal {

    private int hornsCount;

    public Cow(double weight, int age, String color, int hornsCount) {
        super(weight, age, color);
        this.hornsCount = hornsCount;
    }

    public int getHornsCount() {
        return hornsCount;
    }

    public void setHornsCount(int hornsCount) {
        this.hornsCount = hornsCount;
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping now. Zz");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating now.");
    }

    @Override
    public void makeSound() {
        System.out.println("Mouuu");
    }

    @Override
    public void haveARest() {
        eat();
        makeSound();
        sleep();
    }
}
