package Day09;

import java.util.*;
public class HW9_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 5;
        int max = 10;

        int[][] mat = new int[3][3];

        // initializing and displaying
        System.out.println("Matrix: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = random.nextInt(max - min + 1) + min;
                System.out.printf("%3s",mat[i][j]);
            }
            System.out.println();
        }

        showAVG(mat);
    }

    static void showAVG(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println("AVG: " + sum / (mat.length * mat[0].length));
    }
}
