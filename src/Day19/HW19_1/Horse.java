package Day19.HW19_1;

public class Horse {

    double weight; //kilogram
    int age;
    String gender;
    String nickname;
    String color;

    public Horse() {}

    public Horse(double weight, int age, String gender, String nickname, String color) {
        setWeight(weight);
        setAge(age);
        setGender(gender);
        setNickname(nickname);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) return;
        this.weight = weight;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname.equals("")) return;
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("")) return;
        this.color = color;
    }
}
