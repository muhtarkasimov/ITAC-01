package Day21.HW21_2;

public class Person {

    String name;
    int age;
    String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) return;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("")) return;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String s = "Name is: " + name +
                "\nAge is: " + age +
                "\nGender is: " + gender + "\n";

        return s;
    }

    public void eat(Food food) {
        double weight = food.getWeight();
        System.out.println(weight + " grams of " + food.getName() + " are so dilicious, yummy");
    }

    public void sleep(int sleepHours, Time time) {
        time.addHours(sleepHours);
    }

}
