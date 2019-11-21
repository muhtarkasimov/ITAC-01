package Day28.CW28_1;

abstract public class AbstractAnimal {
    private double weight;
    private int age;
    private String color;

    public AbstractAnimal(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public void sleep();

    abstract public void eat();

    abstract public void makeSound();

    public abstract void haveARest();

}
