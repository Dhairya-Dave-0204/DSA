public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbcccddeee";

        String compressed = compress(str);
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compress(String str) {
        StringBuilder compressedString = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            compressedString.append(str.charAt(i));
            if (count > 1) {
                compressedString.append(count);
            }
        }
        return compressedString.toString();
    }
}
