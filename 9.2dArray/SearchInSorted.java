// The matrix given is sorted row-wise and column-wise, we need to find the target in the matrix.
// The search being used is known as Staricase Search. Complexity is O(n + m)

public class SearchInSorted {
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 35;
        staircaseSearch(matrix, target);
        reverseStaircaseSearch(matrix, target);
    }

    // Top right corner search in a sorted matrix
    public static boolean staircaseSearch(int matrix[][], int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if(matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }

    // Bottom left corner search in a sorted matrix
    public static boolean reverseStaircaseSearch(int matrix[][], int target) {
        int row = matrix.length -1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if(matrix[row][col] < target) {
                col++;
            } else {
                row--;
                
            }            
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }
}
