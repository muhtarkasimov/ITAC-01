package Day21.HW21_1;

public class Student {

    private String birthDate;
    private String surname;
    private String name;
    private String gender;
    private int age;

    public Student(){}

    public Student(String birthDate, String surname, String name, String gender, int age) {
        this.birthDate = birthDate;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (birthDate.equals("")) return;
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.equals("")) return;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) return;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("")) return;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) return;
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "Student's name: " + name +
                "\nSurname: " + surname +   
                "\nBirth date: " + birthDate +
                "\nGender: " + gender +
                "\nAge: " + age + "\n";

        return s;
    }
}



