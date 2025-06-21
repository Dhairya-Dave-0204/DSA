public class DescSelection {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.print("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        descSelectionSort(arr);
    }

    public static void descSelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minValueIndex]) {
                    minValueIndex = j;
                }                   
            }
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
        System.out.print("\nSorted array in descending order by selection sort is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
