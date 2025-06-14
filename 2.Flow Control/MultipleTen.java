import java.util.*;

public class MultipleTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        while (number > 0) {
            if (number % 10 == 0) {
                System.out.println("Number is a multiple of 10: " + number);
                break;
            } else {
                System.out.println("Number is not multiple of 10: " + number);
                System.out.println("Enter another number: ");
                number = sc.nextInt();
            }
        }
        sc.close();
    }    
}
