package Day09;

public class CW9_4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[3];
        printArray(arr);
        printArray(arr2);

//        methodRepeater(2, printArray(), arr);
    }

    static void methodRepeater(int counter, Object o) {

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

