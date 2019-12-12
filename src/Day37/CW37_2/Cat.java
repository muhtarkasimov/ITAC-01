package Day37.CW37_2;

import java.util.Objects;

public class Cat {

    private int age;
    private String name;

    public Cat(int age, String name) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Cat) {
            if (this.age == ((Cat) obj).getAge()) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nage: " + age;
    }
}
