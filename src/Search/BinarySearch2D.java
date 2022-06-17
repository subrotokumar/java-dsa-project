package DSA.Search;

import java.util.Arrays;

public class BinarySearch2D {
    static int[] binarySearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1; // Caution: Matrix should ne empty matrix
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col])
                return new int[] { row, col };

            if (target > matrix[row][col])
                row++;

            else
                col--;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String... args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };
        int k = 17;
        System.out.println(Arrays.toString(binarySearch(matrix, k)));
    }
}