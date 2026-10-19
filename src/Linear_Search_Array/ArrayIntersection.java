package Linear_Search_Array;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            // Avoid printing duplicate values from arr1
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            // Search for arr1[i] in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
