package Day30.CW30_1;

public class Turtle extends AbstractReptile implements Swimable, EggProduceable, ShellWearable {

    private String name;
    private int age;

    public Turtle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeEgg() {
        System.out.println("Turtle is making egg");
    }

    @Override
    public void wearShell() {
        System.out.println("Turtle is already have shell");
    }

    @Override
    public void takeOffShell() {
        System.out.println("Turtle cant take off it's shell");
    }

    @Override
    public void swapShell() {
        System.out.println("Turtle is swapping shell");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Turtle is diving");
    }
}
