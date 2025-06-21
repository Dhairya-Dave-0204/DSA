// THis is implemetation of KADAN algorithm. It is most optimized way to alulate the maximum sum of all
// possible subarrays of an array. Its time complexity is O(n) and presents idea that neglet negative and put 0 

public class KadanAlgoForMaxSum {
    public static void main(String[] args) {
        int arr[] = { -3, 5, 7, 4, -2 };
        kadanes(arr);
    }

    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int smallestNegative = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {  
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (arr[i] > smallestNegative && arr[i] < 0) {
                smallestNegative = arr[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        if (currentSum == 0) {
            System.out.println("All elements are negatie. Smallest negative is: " + smallestNegative);
        } else {
            System.out.println("The maximum sum is: " + maxSum);
        }
    }
}
