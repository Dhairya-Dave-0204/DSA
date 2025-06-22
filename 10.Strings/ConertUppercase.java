// Convevrt the first character of each word to uppercase in a given string.

public class ConertUppercase {
    public static void main(String[] args) {
        String str = new String ("hello world! this is a test string.");
        
        System.out.println(convertToUppercase(str));
    }

    public static String convertToUppercase(String str) {
        StringBuilder uppercase = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        uppercase.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                uppercase.append(str.charAt(i));
                i++;
                uppercase.append(Character.toUpperCase(str.charAt(i)));
            } else {
                uppercase.append(str.charAt(i));
            }
        }

        return uppercase.toString();
    }
}
