public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        bubble(arr);
    }

    public static void bubble(int arr[]) {
        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println("The array is already sorted!");
                break;
            }
        }

        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
