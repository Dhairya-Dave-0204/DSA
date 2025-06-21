public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.print("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }
            if(minPosition != i) {
                int temp = arr[i];
                arr[i] = arr[minPosition];
                arr[minPosition] = temp;
            }
        }
        System.out.print("\n Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
