// Tow pointer implementation 
// Removing or finding the duplicate elements in an array

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3 };

        remove(arr);
    }

    public static void remove(int arr[]) {
        int pointer = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[pointer - 1]) {
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;

                pointer++;
            }
        } 
        // return Arrays.copyOf(arr, pointer); 

        System.out.println("The array after processing");
        for (int i = 0; i < pointer; i++) {
            System.out.print(arr[i] + ", ");
        }

        // Brute force code to find duplicate in an unsorted array
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] == arr[i]) {
        // System.out.println("The duplicate element is : " + arr[i]);
        // }
        // }
        // }
    }
}
