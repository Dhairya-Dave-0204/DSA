public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        subArrays(arr);
    }

    public static void subArrays(int arr[]) {
        int currentSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                System.out.println("Sub array from index " + i + " to index " + j + " :");
                for (int k = i; k <= j; k++) {
                    System.out.println(arr[k] + " ");
                    currentSum += arr[k];
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
                System.out.println("Sum of this current subarray: " + currentSum);
            }
        }
        System.out.println("Maximum sum out of all the subarrays: " + maxSum);
    }
}
