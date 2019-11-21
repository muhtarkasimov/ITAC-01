package Day28.CW28_1;

public class Cat extends AbstractFeline {

    private String nickname;

    public Cat(double weight, int age, String color, int clawsCount, double tailLength, String nickname) {
        super(weight, age, color, clawsCount, tailLength);
        this.nickname = nickname;
    }

    public Cat(double weight, int age, String color, String nickname) {
        super(weight, age, color);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void sharpClaws() {
        System.out.println("Cat is sharpening claws.");
    }

    @Override
    public void purr() {
        System.out.println("Brrrr Brrrr.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping now.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating now.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void haveARest() {
        eat();
        makeSound();
        sharpClaws();
        sleep();
        purr();
    }
}
