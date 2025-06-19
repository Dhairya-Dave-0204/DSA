// * * * * * * *
// *           *
// *           *
// * * * * * * *

public class HollowRect {
    public static void main(String[] args) {
        hollowRect(10, 10);
    }

    public static void hollowRect(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}