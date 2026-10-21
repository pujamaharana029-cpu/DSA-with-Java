package Linear_Search_Array;

import java.util.Arrays;

public class ReplaceWithGreatestRight {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];

            arr[i] = maxRight;

            if (current > maxRight) {
                maxRight = current;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}