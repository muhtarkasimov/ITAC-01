package Day31.CW31_1;

public class CW31_1 {


    public static void main(String[] args) {

        Oceanarium oceanarium = new Oceanarium(14);

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                oceanarium.addSwimable(new Duck());
            } else {
                oceanarium.addSwimable(new Shark());
            }
        }

        Turtle t1 = new Turtle("Leonardo");
        Turtle t2 = new Turtle("Rafael");
        Turtle t3 = new Turtle("Donatello");
        Turtle t4 = new Turtle("Michelangelo");

        oceanarium.addSwimable(t1);
        oceanarium.addSwimable(t2);
        oceanarium.addSwimable(t3);
        oceanarium.addSwimable(t4);

        Oceanarium turltes = new Oceanarium(4);
        Oceanarium sharks = new Oceanarium(5);
        Oceanarium ducks = new Oceanarium(5);

        int counter = 0;
        for (Swimable s : oceanarium.getSwimables()) {
            s.makeSound();
            if (s instanceof Turtle) {
                turltes.addSwimable(s);
                ((Turtle)s).makeEgg();
                counter++;
            } else if (s instanceof Shark) {
                ((Shark)s).hunt();
                sharks.addSwimable(s);
            } else {
                ducks.addSwimable(s);
            }
        }
        System.out.println(counter + " turtles in oceanarium");

        for (Swimable t : turltes.getSwimables()) {
            System.out.println(((Turtle)t).getName());
        }


    }
}
