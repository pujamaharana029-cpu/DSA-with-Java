package Linear_Search_Array;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;

            // Check if this element appeared before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            // Count occurrences of the current element
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
