package Revision;

public class MaximumProductPair {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 1};

        int maxProduct = arr[0] * arr[1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int product = arr[i] * arr[j];

                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        System.out.println("Maximum product: " + maxProduct);
    }
}
