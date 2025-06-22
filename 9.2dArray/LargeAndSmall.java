// Find out largest and smallest element in a 2D array

import java.util.*;

public class LargeAndSmall {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        findLargeAndSmall(arr);
    }

    public static void findLargeAndSmall(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
