// Rotate the array by one position from a position enterd 

public class RotateArray {
    public static void main(String[] args) {
        int arr [] = { 23,56,1,6,387,9 };

        rotate(arr);
    }

    public static void rotate(int arr[]) {
        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        
        // Good approach using a  single pass of bubble sort but not optimal, WHY??
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[i + 1];
        //     arr[i + 1] = temp;
        // }


        System.out.println("The array after the swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
