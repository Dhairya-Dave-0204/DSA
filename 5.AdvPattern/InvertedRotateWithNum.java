// 1234
// 123
// 12
// 1

public class InvertedRotateWithNum {
    public static void main(String[] args) {
        InvertedRotatePyramidWithNumbers(5);
    }

    public static void InvertedRotatePyramidWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
