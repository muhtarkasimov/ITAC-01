package Day21.HW21_1;

public class Person {

    String fullName;
    int age;
    String gender;

    public Person() {
    }

    public Person(String fullName, int age, String gender) {
        setFullName(fullName);
        setAge(age);
        setGender(gender);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName.equals("")) return;
        this.fullName = fullName;
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
        String s = "My name is " + fullName +
                "\nMy age is " + age + " years" +
                "\nMy gender is " + gender;
        return s;
    }
}
