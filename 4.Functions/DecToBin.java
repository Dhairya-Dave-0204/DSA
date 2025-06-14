import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        decToBin(decimal);

        input.close();
    }

    public static void decToBin(int decimal) {
        int binary = 0;
        int power = 0;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * Math.pow(10, power);
            power++;
            decimal /= 2;
        }

        System.out.println("Binary value: " + binary);
    }
}
