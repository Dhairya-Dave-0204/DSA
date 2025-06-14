import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to generate its multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i < 11; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        sc.close();
    }
}
