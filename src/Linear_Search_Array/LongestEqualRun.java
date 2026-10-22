package Linear_Search_Array;
public class LongestEqualRun {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};

        if (arr.length == 0) {
            System.out.println(0);
            return;
        }

        int currentCount = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        System.out.println("Longest run: " + maxCount);
    }
}
