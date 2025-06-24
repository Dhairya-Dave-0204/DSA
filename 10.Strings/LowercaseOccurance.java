// How many lowercase classes are there in a string entered by the user

import java.util.Scanner;

public class LowercaseOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int lowercaseCount = countLowercase(str);
        System.out.println("Number of lowercase letters: " + lowercaseCount);

        input.close();
    }

    public static int countLowercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++; 
            }
        }
        return count;
    }
}
