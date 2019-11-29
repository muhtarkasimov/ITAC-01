package Day31.CW31_1;

public class Duck implements Swimable {

    public Duck() {
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Krya krya");
    }
}
