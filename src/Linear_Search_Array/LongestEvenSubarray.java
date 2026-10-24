package Linear_Search_Array;

public class LongestEvenSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 8, 10, 12};

        int currentLength = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }

        System.out.println("Longest even subarray length: " + maxLength);
    }
}