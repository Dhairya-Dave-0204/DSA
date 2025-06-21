public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 7, 3, 3, 1 };
        System.out.print("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        countingSort(arr);
    }

    public static void countingSort(int arr[]) {
        // Step 1: Find the maximum element in the array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        // Step 2: Create a count array of size largest + 1
        // The +1 is done because the index starts from 0, so if largest is 5, we need an array of size 6
        int count[] = new int [largest + 1];

        // Step 3: Count the occurrences of each element in the original array and store it in the count array
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting the array using the count array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
        System.out.print("\n Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
