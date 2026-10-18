package Linear_Search_Array;
import java.util.Arrays;

public class CountingApproach {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count each number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        // Fill the array with zeros
        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }

        // Fill the array with ones
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }

        // Fill the array with twos
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
