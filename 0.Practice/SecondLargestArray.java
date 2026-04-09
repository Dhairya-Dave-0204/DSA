import java.util.*;

public class SecondLargestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[6];

        System.out.println("Enter the elements in the array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        secondLargest(arr);

        input.close();
    }

    public static void secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                continue;
            }
            
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println("The max element in the array is: " + max);
        System.out.println("The second max element in the array is: " + secondMax);
    }
}
