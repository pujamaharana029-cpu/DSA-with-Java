package Linear_Search_Array;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 5, 6, 7};

        if (arr.length == 0) {
            System.out.println(0);
            return;
        }

        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Longest increasing subarray length: "
                + maxLength);
    }
}