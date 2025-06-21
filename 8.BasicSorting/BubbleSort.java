public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
    }
    
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Here i indidcates the number of turns or passes
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                System.out.println("\n Array is already sorted after " + (i + 1) + " passes.");
                break; 
            }
            
        }
        System.out.print("\n Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
