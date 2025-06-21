import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.print("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        insertionSort(arr);
        // Java provides a built-in method to sort arrays having O(n log n) time complexity
        // We can even proide a custom index which is nox inclusie to sort specific part of the array
        System.out.print("\nUsing built-in method to sort the array: ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currentPositionValue = arr[i];
            int previousPosition = i - 1;
            // We will compare the current element with the previous elements to find out
            // correct position
            while (previousPosition >= 0 && arr[previousPosition] > currentPositionValue) {
                arr[previousPosition + 1] = arr[previousPosition];
                previousPosition--;
            }
            // After finding the correct position for the current element, we place it at
            // that position
            arr[previousPosition + 1] = currentPositionValue;
        }
        System.out.print("\n Sorted array by insertion is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
