// Count the frequency of appearance of each element
// If a question comes related the frequency in array first thing to do is to sort the array then try things

import java.util.Arrays;

public class FrequencyOfEach {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 1, 1 };

        Arrays.sort(arr);

        frequency(arr);
    }

    public static void frequency(int arr[]) {

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("The count for " + arr[i - 1] + " is: " + count);
                count = 1;
            }
        }
        System.out.println("The count for " + arr[arr.length - 1] + " is: " + count);

        // Brute force logic for counting frequency of each element but it repeats the
        // elements
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // }
        // }
        // System.out.println("The count for " + arr[i] + " is: " + count);
        // count = 0;
        // }
    }
}
