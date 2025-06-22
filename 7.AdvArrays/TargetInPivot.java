/* 
 There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to 
 your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that 
 the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0indexed).
 For example, [0,1,2,4,5,6,7] might  be rotated at index 3 and become [4,5,6,7,0,1,2].
 Given the array nums after the possible rotation and an integer target, return the index of target if it is 
 in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity. 
*/

import java.util.*;

public class TargetInPivot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {0,1,2,4,5,6};

        System.out.print("Enter the pivot index: ");
        int pivotIndex = input.nextInt();

        // System.out.print("\n Enter target: ");
        // int target = input.nextInt();

        pivotRotate(arr, pivotIndex);
        System.out.println("Your array after pivot rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // int result = findTarget(arr, target);
        // if (result == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Found at index " + result);
        // }

        input.close();
    }

    public static void pivotRotate(int arr[], int pivotIndex) {
        int size = arr.length;
        // If length of the array is even the we can directly swap the start with the pivot
        if(size % 2 == 0) {
            for (int i = 0; i < pivotIndex; i++) {
                int temp = arr[i];
                arr[i] = arr[pivotIndex + i];
                arr[pivotIndex + i] = temp;
            }
        }
    }

    public static int findTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
