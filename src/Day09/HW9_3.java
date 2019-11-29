package Day09;

public class HW9_3 {
    public static void main(String[] args) {

        int[] a = {14,12,99,23,19};
        System.out.print("Array contains: ");
        for (int i : a) System.out.print(i + " ");
        System.out.println();
        method(a);

    }

    static void method(int[] a) {
        System.out.print("Second part: ");
        for (int i = (a.length)/2; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
