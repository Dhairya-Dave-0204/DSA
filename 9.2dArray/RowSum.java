// Print the sum of row enterd by the user in a 2D array

import java.util.*;

public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.print("Enter the row number to calculate the sum (0-indexed): ");
        int row = sc.nextInt();

        calculateRowSum(arr, row);
    }

    public static void calculateRowSum(int arr[][], int rowNumber) {
        if (rowNumber < 0 || rowNumber >= arr.length) {
            System.out.println("Invalid row number.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum = sum + arr[rowNumber][i];
        }
        System.out.print("The sum of the elements in row " + rowNumber + " is: " + sum);

    }
}
