//  Given an integer array nums, return true if any value appears at least twice in 
//  the array, and return false if every element is distinct.

import java.util.*;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int nums[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        if (elementOccurance(nums)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }

    public static boolean elementOccurance(int arr[]) {
        int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == currentValue) {
        //         count++;
        //         tempCurrent = arr[i];
        //     }
        //     if (count >= 2) {
        //         return tempCurrent;
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == currentValue) {
                    count++;
                }
                if (count >= 2) {
                    return true;
                }
            }
            count = 0;
        }
        return false;
    }
}
