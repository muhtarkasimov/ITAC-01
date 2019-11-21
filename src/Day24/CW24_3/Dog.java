package Day24.CW24_3;

public class Dog {
    private static int counter = 0;
    private String name;
    private double weight;
    private int age;

    public Dog () {
        addCount();
    }

    public Dog(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        addCount();
    }

    public static int getCount() {
        return counter;
    }

    private static void addCount() {
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
