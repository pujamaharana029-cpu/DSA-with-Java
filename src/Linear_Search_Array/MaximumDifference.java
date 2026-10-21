package Linear_Search_Array;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        int minValue = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - minValue;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Maximum difference: " + maxDifference);
    }
}
