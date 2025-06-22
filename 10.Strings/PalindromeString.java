import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String str = input.next();

        boolean result = isPalindrome(str);
        if (result) {
            System.out.println("The string is palindrome!");
        } else {
            System.out.println("The string is not palindrome!");
        }

        input.close();
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 0) {
            System.out.println("Not a valid string!");
        }

        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
