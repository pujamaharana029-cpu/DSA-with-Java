package Day_7;

import java.util.Scanner;

public class MinimumElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //minimum element in Array
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print(min + " ");
    }
}

