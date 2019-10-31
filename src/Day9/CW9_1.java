package Day9;

import java.util.*;
public class CW9_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int min = 1, max = 9;
        int[][] matrix = new int[3][3];
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
                sum += matrix[i][j];
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double avg = sum / (matrix.length * matrix.length);
        System.out.printf("\n %.2f", avg);

    }
}

