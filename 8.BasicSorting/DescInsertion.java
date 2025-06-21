public class DescInsertion {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.print("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        descInsertionSort(arr);
    }

    public static void descInsertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int currentPositionValue = arr[i];
            int previousPosition = i - 1;
            while (previousPosition >= 0 && arr[previousPosition] > currentPositionValue) {
                arr[previousPosition + 1] = arr[previousPosition];
                previousPosition--;
            }
            arr[previousPosition + 1] = currentPositionValue;
        }
        System.out.print("\nSorted array in descending order by insertion sort is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
