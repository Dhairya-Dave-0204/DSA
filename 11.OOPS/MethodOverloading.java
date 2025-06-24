public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.sum(5, 10)); 
        System.out.println("Sum of 5.5 and 10.5: " + calc.sum(5.5f, 10.5f)); 
        System.out.println("Sum of 5, 10, and 15: " + calc.sum(5, 10, 15)); 
    }
}

 class Calculator {
    int sum (int a, int b) {
        return a + b;
    }

    float sum (float a, float b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a + b + c;
    }
}
