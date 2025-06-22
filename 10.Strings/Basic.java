// Strings can be used to represent text data in Java, somewhat similar to an character array.
// Strings are immutable in Java, meaning once created, their values cannot be changed.
// However, you can create a new string with the desired changes.

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd', 'e' }; // character array
        String str = "abcde"; // 1st way to create a string
        String str2 = new String("abcde"); // 2nd way to create a string

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name wihout spaces: ");
        String name = input.next(); // This will read a single word (until space)
        System.out.println("Name: " + name);

        System.out.print("Enter full name with spaces: ");
        String fullName = input.nextLine(); // This will read a full line (including spaces)
        System.out.println("Full Name: " + fullName);

        input.close();
    }
}
