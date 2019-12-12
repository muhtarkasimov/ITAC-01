package Day37.CW37_3;

import java.util.*;

public class CW37_3 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            String s = it.next();
            if (s.equals("2")) {
                System.out.println("2 found");
            } else {
                System.out.println("2 not found ");
            }
        }

    }
}
