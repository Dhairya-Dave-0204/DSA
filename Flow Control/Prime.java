import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime:");
        int num = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num < 2) {
            isPrime = false; // Numbers less than 2 are not prime
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}