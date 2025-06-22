public class BasicOperations {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of the string
        int len = str.length();
        System.out.println("Length of the string: " + len);

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Accessing characters using charAt
        printCharacters(str);
    }

    public static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}