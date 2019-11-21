package Day28.CW28_1;

public class CW28_1 {

    public static void main(String[] args) {

        Cat cat = new Cat(15000, 10, "Black", 32, 20, "Murka");
        Cow cow = new Cow(2000000, 20, "Black-White", 3);
        Tiger tiger = new Tiger(1000000, 30, "White", 36, 45, 66);

        cat.haveARest();
        tiger.haveARest();
        cow.haveARest();

    }
}
