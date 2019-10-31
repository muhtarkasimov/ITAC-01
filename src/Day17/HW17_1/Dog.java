package Day17.HW17_1;

public class Dog {

    private String breed;
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String breed, String name, int age) {
        if (age < 0 ) return;
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
}
