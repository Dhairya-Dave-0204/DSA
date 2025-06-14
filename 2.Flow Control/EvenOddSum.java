import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of numbers to be enterd: ");
        int amount = sc.nextInt();
        int evenSum = 0;
        int evenCount = 0;
        int oddSum = 0;
        int oddCount = 0;

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("Even number enterd!");
                evenCount++;
                evenSum += number;
            } else {
                System.out.println("Odd number enterd!");
                oddCount++;
                oddSum += number;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
    }
}
