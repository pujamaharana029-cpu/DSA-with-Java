package Linear_Search_Array;


public class EqualZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0};

        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int zeros = 0;
            int ones = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }

                if (zeros == ones) {
                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }

        System.out.println("Longest subarray length: " + maxLength);
    }
}