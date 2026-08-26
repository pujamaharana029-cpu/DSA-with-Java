package Day_7;

import java.util.Scanner;

public class ProductOfTheElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // product of array
        int product=1;
        for(int i=0;i<n;i++) {
            product *= arr[i];
        }
        System.out.println(product +" ");
    }
}
