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
//        } catch (NullPointerException npe) {
//            //code for npe catching and etc.
//        } catch (Exception e) {
//            System.out.println("Error is appeared in cats array on index: " + i);
//            e.printStackTrace();
        } finally {
            System.out.println("'finally {}' field is printed");
        }
        // spoiler: the 'code run check' will not be displayed, because of the exceptions stops code
        // but the 'finally part' will work
        // output will be 'Murzik, Bobik, finally field' displayed and after this OutOfBound exception will appear
        System.out.println("'code run check'");
    }
}
