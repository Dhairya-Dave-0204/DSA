// Sub string is a contiguous sequence of characters within a string.
// For example, "Hello" is a substring of "HelloWorld!".

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        String str = "HelloWorld!";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a starting index: ");
        int startIndex = input.nextInt();
        System.out.print("Enter an ending index: ");
        int endIndex = input.nextInt();

        // Java has a built-in method to get substrings as below:
        // String subString = str.substring(startIndex, endIndex); 

        findSubStrings(str, startIndex, endIndex);

        input.close();
    }

    public static void findSubStrings(String str, int start, int end) {
        if (start < 0 || end > str.length() || start >= end) {
            System.out.println("Invalid indices!");
            return;
        }

        String subString = "";

        for (int i = start; i < end; i++) {
            subString = subString + str.charAt(i);
        }
        System.out.println("The substring from index " + start + " to " + end + " is: " + subString);
    }
}
