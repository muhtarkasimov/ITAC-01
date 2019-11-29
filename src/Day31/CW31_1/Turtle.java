package Day31.CW31_1;

public class Turtle implements Swimable{

    private int eggsCounter;
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    public int getEggsCounter() {
        return eggsCounter;
    }

    public void setEggsCounter(int eggsCounter) {
        this.eggsCounter = eggsCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("I don't wonna swim master Splinter!");
    }

    @Override
    public void makeSound() {
        System.out.println("We are \"Teenage Mutant Ninja Turtles\"");
    }

    public void makeEgg() {
        System.out.println("Making an egg. (But TMNT doesn't this)");
        eggsCounter++;
    }
}
