package Day33.CW33_2;

public class CW33_2 {

    public static void main(String[] args) throws Exception {
        //there are two versions of this file on GitHub
        //first one was catching nullPointer exception
        //this one is catching outOfBound exception

        Cat[] cats = {new Cat("Murzik"), new Cat("Bobik")};

        int i = 0;
        try {
            for (; i < cats.length + 1; i++) {
                System.out.println(cats[i].getName());
            }
        } catch (Exception e) {
            System.out.println("Error is appeared in cats array on index: " + i);
            e.printStackTrace();
        } finally {
            System.out.println("'finally {}' field is printed");
        }
        System.out.println("'code run check'");
    }
}
