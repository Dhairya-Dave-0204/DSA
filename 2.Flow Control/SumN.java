import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number N: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of all numbers from 0 to " + num + " is: " + sum);
        sc.close();
    }
}
