// In java strings are immutable, meaning once created, they cannot be changed.

// To modify a string, a new string is created with the modified value. And this can be inefficient
// when performing multiple modifications.

// StringBuilder is a mutable sequence of characters, which means it can be modified without creating a
// new object each time a modification is made.


public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("String Builder content: " + sb);
    }
}
