package Day09;

import java.util.*;
public class CW9_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int minBound = 10;
        int maxBound = 99;
        int[][] matrix = new int[3][3];
//        String maxIndex = "";
//        String minIndex = "";
        int minI = 0;
        int minJ = 0;
        int maxI = 0;
        int maxJ = 0;
        int min = maxBound;
        int max = minBound;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(maxBound - minBound + 1) + minBound;
                System.out.print(matrix[i][j] + " ");

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxI = i;
                    maxJ = j;
//                    maxIndex = "" + i + j;
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minI = i;
                    minJ = j;
//                    minIndex = "" + i + j;
                }

            }
            System.out.println();
        }
        System.out.printf("\nMax element A[%d][%d] = %d", maxI, maxJ, max);
        System.out.printf("\nMin element A[%d][%d] = %d", minI, minJ, min);

//        System.out.printf("\nMax element A[%s][%s] = %d",maxIndex.charAt(0),maxIndex.charAt(1), max);
//        System.out.printf("\nMin element A[%s][%s] = %d",minIndex.charAt(0),minIndex.charAt(1), min);

    }
}

