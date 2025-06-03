import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '/':
                if (num2 > 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }

            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /");
                break;
        }
        sc.close();
    }
}
