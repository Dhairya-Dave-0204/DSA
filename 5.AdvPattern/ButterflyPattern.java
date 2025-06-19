
// *         *
// * *     * *
// * * * * * *
// * * * * * *
// * *     * *
// *         *

public class ButterflyPattern {
    public static void main(String[] args) {
        butterfly(5);
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half of the butterfly
        for (int i = n; i >= 1; i--) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
