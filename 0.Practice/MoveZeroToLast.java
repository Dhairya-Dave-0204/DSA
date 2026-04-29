// Two pointer method implementation 

public class MoveZeroToLast {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 4, 0 };

        moveToLast(arr);
    }

    public static void moveToLast(int arr[]) {
        int pointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;

                pointer++;
            }
        }

        System.out.println("The array after processing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
