import java.util.*;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of its digits: ");
        int number = input.nextInt();
        sumOfDigits(number);
        input.close();
    }

    public static void sumOfDigits(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}
