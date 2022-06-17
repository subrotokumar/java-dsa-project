package DSA.Search;

import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int target = 11;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    // Linear binary search in a perticular row of a matrix
    static int[] search(int matrix[][], int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {

            int mid = (cStart + cEnd) / 2;

            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if (target < matrix[row][mid]) {
                cEnd = mid - 1;
            } else {
                cStart = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int matrix[][], int target) {

        if (matrix.length <= 0)
            return new int[]{-1, -1};

        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            search(matrix, 0, 0, col, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        while (rStart < (rEnd - 1)) {
            int mid = (rStart + rEnd) / 2;
            if (target == matrix[mid][cMid]) {
                return new int[]{mid, cMid};
            }
            if (target > matrix[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows
        if (matrix[rStart][cMid] == target)
            return new int[]{rStart, cMid};

        if (matrix[rStart + 1][cMid] == target)
            return new int[]{rStart + 1, cMid};

        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {

        }
        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {

        }
        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {

        }
        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {

        }

        return new int[]{-1, -1};
    }
}