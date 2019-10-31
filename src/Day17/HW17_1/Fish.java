package Day17.HW17_1;

public class Fish {

    private String name;
    private String breed;
    private int age;

    public Fish(){
    }

    public Fish(String name, String breed, int age) {
        if (age < 0 ) return;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) return;
        this.age = age;
    }
}
