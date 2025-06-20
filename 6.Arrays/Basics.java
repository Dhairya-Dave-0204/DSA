import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[3];
        int marks[] = new int[5];

        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();
        System.out.println("Firstnumber: " + numbers[0]);
        System.out.println("Second number: " + numbers[1]);

        System.out.println("Enter the marks of 5 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        double average = 0;
        for (int i = 0; i < marks.length; i++) {
            average += marks[i];
        }
        System.out.println("The average of Marks are: " + (average / marks.length));

        input.close();
    }
}
