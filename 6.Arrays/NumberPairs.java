public class NumberPairs {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printPairs(arr);
    }
    public static void printPairs(int arr[]) {
        int arrayLength = arr.length - 1;
        int totalPairs = 0;
        for(int i = 0; i <= arrayLength; i++) {
            for(int j = i + 1; j <= arrayLength; j++) {
                System.out.print("(" + arr[i] + " " + arr[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Paris obtained: " + totalPairs);
    }
}
