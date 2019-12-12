package Day37.CW37_1;
import java.util.*;

public class CW37_1 {

    public static void main(String[] args) {
        ArrayList<Multiple> list = new ArrayList<>();
        add(new Multiple(10,10), list);
        add(new Multiple(3,5), list);
        add(new Multiple(20,5), list);

        System.out.println(list);
    }

    public static boolean add(Multiple m, ArrayList<Multiple> list) {
        if (list.contains(m)) return false;
        list.add(m);
        return true;
    }
}
