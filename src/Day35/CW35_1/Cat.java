package Day35.CW35_1;

public class Cat {

    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Cat) {
            if (((Cat) obj).getName() == name && ((Cat) obj).getAge() == age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
