// Java has a built-in method to compare strings, known as compareTo, used to compare two strings lexicographically.
// Lexicographically means that the strings are compared based on the Unicode value of each character.
// If the first string is lexicographically less than the second string, it returns a negative integer.
// If the first string is lexicographically greater than the second string, it returns a positive integer.
// If the two strings are equal, it returns zero.
public class ComparingString {
    public static void main(String[] args) {
        String fruits[] = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

        String largest = fruits[0];
        
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].compareTo(largest) > 0) {
                largest = fruits[i];
            } 
        }
        System.out.println("The largest string in the array is: " + largest);
    }
}
