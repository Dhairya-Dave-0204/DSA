// This file contains basic input and outup of an 2d array

import java.util.*;

public class Basic2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int [3][4];

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Enter the elements of the 2D array (3 rows, 4 columns): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the key to search: ");
        int key = input.nextInt();
        search(matrix, key);

        input.close();
    }

    public static void search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Found at row " + i + " and column " + j);
                    return;
                    
                }
            }
        }
        System.out.println("Not found");
    }
}
