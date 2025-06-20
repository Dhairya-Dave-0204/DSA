// as the general / bruteforce method to find maxsum has n^3 complexity we use this optimized method
// this method has the time complexity of n^2

public class PrefixArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        prefiArray(arr);
    }

    public static void prefiArray(int arr[]) {
        int currentSum, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i -1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[j] - prefix[i - 1]; 
                
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum out of all sub arrays: " + maxSum);
    }
}
