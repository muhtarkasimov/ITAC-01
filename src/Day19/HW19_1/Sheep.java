package Day19.HW19_1;

public class Sheep {

    double weight; //kilogram
    int age;
    String gender;
    String nickname;

    public Sheep() {}

    public Sheep(double weight, int age, String gender, String nickname) {
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

    @Override
    public String toString() {
        String s = "Sheep's nickname is " + nickname + ", it's age is " + age + ", it's weight is " + weight + " kilograms and gender is " + gender;
        return s;
    }

}
