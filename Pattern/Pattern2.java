// ****
// ***
// **
// *
// Another approach for this question is the formula: n - line + 1 used in the inner loop.

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
