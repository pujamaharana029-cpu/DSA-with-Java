package Linear_Search_Array;

public class LongestPositiveSumSubarray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2};

        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum > 0) {
                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }

        System.out.println("Longest positive-sum subarray length: "
                + maxLength);
    }
}