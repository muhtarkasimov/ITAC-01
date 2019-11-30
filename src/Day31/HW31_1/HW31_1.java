package Day31.HW31_1;

public class HW31_1 {

    public static void main(String[] args) {

        Turtle t1 = new Turtle("Leonardo", 15, 100);
        Duck d1 = new Duck("Pascal", 14, 125);
        Shark s1 = new Shark("Arab", 13, 75);

        SelectAnimal[] animals = {t1, d1, s1,};

        // selecting by
        for (SelectAnimal sa : animals) {
            if (sa instanceof Shark && ((Shark)sa).getAge() > 10) {
                System.out.println(((Shark) sa).getName() + " is shark and he is over than 10 years old)");
            }
        }
    }
}
