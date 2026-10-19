package Linear_Search_Array;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        // Print distinct elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            boolean duplicate = false;

            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr1[i] + " ");
            }
        }

        // Print elements of arr2 not already in arr1
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            // Also avoid duplicates within arr2
            for (int k = 0; k < i; k++) {
                if (arr2[i] == arr2[k]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
