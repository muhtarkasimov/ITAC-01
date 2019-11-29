package Day09;

public class CW9_8 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        changeArray(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void changeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
    }

}
