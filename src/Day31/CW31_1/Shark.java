package Day31.CW31_1;

public class Shark implements Swimable {

    public Shark() {
    }

    public void hunt() {
        System.out.println("Shark is hunting");
    }

    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Shark: ...");
    }
}
