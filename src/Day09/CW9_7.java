package Day09;

public class CW9_7 {
    public static void main(String[] args) {

        int[] a = {1,2,3};

        changeArray(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    static void changeArray(int[] a) {
        a[0] = 10;
    }

}
