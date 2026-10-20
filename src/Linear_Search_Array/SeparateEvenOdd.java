package Linear_Search_Array;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 7, 4};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Find an odd number on the left
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Find an even number on the right
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}