package Day17.HW17_2;

import java.util.Calendar;
import java.util.Date;

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
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) return;
        this.age = age;
    }
}



