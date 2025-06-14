import java .util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        binToDec(binary);
        sc.close(); 
    }

    public static void binToDec(int binary) {
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
            
        }

        System.out.println("Decimal value: " + decimal);
    }
}
