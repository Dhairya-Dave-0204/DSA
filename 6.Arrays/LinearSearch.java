import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = { "Dhosa", "Idli", "Samosa", "Pav Bhaji", "Dhokla", "Pani Puri", "Pizza", "Burger" };

        System.out.print("Enter the element to search: ");
        String key = input.nextLine();

        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        input.close();
    }

    public static int linearSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1; // Element not found
    }
}