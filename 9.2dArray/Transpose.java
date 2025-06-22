// Code to calculate transpose of a matrix, i.e. swapping rows with columns with auxilary array

public class Transpose {
    public static void main(String[] args) {
        int arr[][] = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 } 
        };
        findTranspose(arr);
    }

    public static void findTranspose(int arr[][]) {
        int originalRow = arr.length;
        int originalCol = arr[0].length;
        // swapping row with col i.e. MxN matrix => NxM matrix
        int transposeRow = originalCol;
        int transposeCol = originalRow;

        int transposeMatrix[][] = new int[transposeRow][transposeCol];

        // Swapping the rows with columns
        for (int i = 0; i < transposeRow; i++) {
            for (int j = 0; j < transposeCol; j++) {
                transposeMatrix[i][j] = arr[j][i];
            }
        }

        System.out.println("The transpose of matrix is: ");
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    } 
}