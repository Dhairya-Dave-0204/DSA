import java.util.*;

public class IsArraySorted {
    public static void main(String[] args) {

        int arr[] = { 4, 10, 3, 5, 8, 9 };

        boolean sorted = isSorted(arr);

        if (sorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }

    }

    public static boolean isSorted(int arr[]) {
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
            }
        }

        return sorted;
    }
}
