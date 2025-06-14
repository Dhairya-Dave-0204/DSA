import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the end of the range:");
        int end = sc.nextInt();

        printPrimeNumber(end);

        sc.close();
    }

    public static void printPrimeNumber(int number) {
       for (int i = 0; i < number; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
        }
       }
       System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}