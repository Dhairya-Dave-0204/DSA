// Two pointer method implementation
// Find a pair of elements having the target sum in an sorted array

public class PairWithSum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, };

        int sum = 7;

        findPair(arr, sum);
    }

    public static void findPair(int arr[], int sum) {
        int pointerA = 0;
        int pointerB = arr.length - 1;
        boolean found = false;

        while (pointerA < pointerB) {

            if (arr[pointerA] + arr[pointerB] == sum) {
                found = true;
                System.out.println("The pair of elements is: " + arr[pointerA] + "  " + arr[pointerB]);
                System.out.println("The pair is found at the index: " + pointerA + "  " + pointerB);
                pointerA++;
                pointerB--;
            } else {
                if (arr[pointerA] + arr[pointerB] > sum) {
                    pointerB--;
                } else {
                    pointerA++;
                }
            }

        }

        if (!found) {
            System.out.println("No pairs found!");
        }
    }
}
