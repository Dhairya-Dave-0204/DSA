import java.util.Scanner;

public class Binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();

        if (n < r) {
            System.out.println("Invalid input, n should be greater than or equal to r.");
        } else {
            int coefficient = binomail(n, r);
            System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + coefficient);
        }
        sc.close();
    }

    public static int factorail(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            fact = 1;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomail(int n, int r) {
        int factN = factorail(n);
        int factR = factorail(r);
        int factNR = factorail(n - r);

        int coefficient = factN / (factR * factNR);

        return coefficient;
    }
}
