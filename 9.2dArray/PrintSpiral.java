// Classic 2d array question to print the elements in spiral order coering the boundaries and moving inward.

public class PrintSpiral {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break; // To avoid printing the same row again
                System.out.print(matrix[endRow][j] + " ");
            }

            // left boundary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) break; // To avoid printing the same column again
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
