package Linear_Search_Array;

public class Equilibriumindex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};

        int totalSum = 0;

        // Calculate the sum of the whole array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum += arr[i];
        }

        System.out.println(equilibriumIndex);
    }
}
