package Day_7;

import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // sum of array
        int sum=0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
            System.out.println(sum +" ");
    }
}
