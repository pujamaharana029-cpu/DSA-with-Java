package Linear_Search_Array;

public class AlternatingEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 6, 3, 4};

        if (arr.length == 0) {
            System.out.println("Longest length: 0");
            return;
        }

        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < arr.length; i++) {
            boolean differentParity =
                    arr[i] % 2 != arr[i - 1] % 2;

            if (differentParity) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Longest alternating subarray length: "
                + maxLength);
    }
}