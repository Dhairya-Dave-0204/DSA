// 1
// 2 3
// 4 5 6
// 7 8 9 10

public class FloydTriangle {
    public static void main(String[] args) {
        floydTriangle(5);
    }

    public static void floydTriangle(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}