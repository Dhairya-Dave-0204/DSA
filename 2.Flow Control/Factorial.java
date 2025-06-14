import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        long factorial = 1;
        if (number <= 0) {
            System.out.println("Factorial is not defined for negative numbers and 0.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        sc.close();
    }
}
