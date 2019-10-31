package Day17.HW17_1;

public class Parrot {

    private String name;
    private int age;
    private String color;

    public Parrot(){
    }

    public Parrot(String name, int age, String color) {
        if (age < 0 ) return;
        this.name = name;
        this.age = age;
        this.color = color;
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
        if (age < 0 ) return;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
