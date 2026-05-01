public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int key = 3;

        binary(arr, key);
    }

    public static void binary(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        
        boolean flag = false;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("The element is found at index " + mid);
                flag = true;
                break;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (!flag) {
            System.out.println("Element not found!");
        }
    }
}
