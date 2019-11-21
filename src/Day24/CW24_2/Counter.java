package Day24.CW24_2;

public class Counter {

    private static int numOfCalls = 0;

    public static void increment() {
        numOfCalls++;
    }

    public int factorial() {
        int n = 1;
        for (int i = 2; i <= numOfCalls; i++) {
            n *= i;
        }
        return n;
    }

}
