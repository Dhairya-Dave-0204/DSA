public class SubArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        printSubArrays(arr);
    }

    public static void printSubArrays(int[] arr) {
        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Subarray from index " + i + " to " + j + ":");
                int sumOfSub = 0;
                for (int k = i; k <= j; k++) {
                    sumOfSub += arr[k];
                    System.out.print("" + arr[k] + " ");
                }
                System.out.println("The sum of this subarray is: " + sumOfSub);
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + totalSubArrays);
    }
}
