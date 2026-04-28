import java.lang.*;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {69,23,7,2,68,79,3,23,5, 80};

        findSecond(arr);
    }

    public static void findSecond(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                secMax = arr[i];
            }
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The second largest number is: " + secMax);
    }
}
