// To print the sum of the diagonals of a 2D array, it must be a square matrix

public class DiagonalSum {    
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = calculateDiagonalSum(matrix);
        System.out.println("The sum of the diagonals is: " + sum);
    }

    public static int calculateDiagonalSum(int matrix[][]) {
        int sum = 0;

        // The below code is for the brute force approach for even square matrices. complexity is O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j]; // Primary diagonal
        //         }
        //         if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j]; // Secondary diagonal
        //         }
        //     }
        // }

        // Optimized approach for square matrices, complexity is O(n)
        for (int i = 0; i < matrix.length; i++) {
            // Add the primary diagonal element
            sum += matrix[i][i];
            // Add the secondary diagonal element
            if (i != matrix.length - 1 - i) { // Here matrix.length-1-i is j
            // Avoid double counting the center element in odd-sized matrices
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }
}
