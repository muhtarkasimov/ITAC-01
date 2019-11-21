package Day20.CW20_1;

public class Person {

    public static void main(String[] args) {
        Person p = new Person("John", 25, "male");
        System.out.println(p);
        System.out.println(p.toString());
    }

    String name;
    int age;
    String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String message = "My name is " + name;
        return "Hello";
    }


}
