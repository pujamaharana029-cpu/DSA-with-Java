package Day_7;

import java.util.Scanner;

public class LargestElementUsingFunction {
    public static int Largest(int[]arr){
        int max =Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
        }
        System.out.println(max +" ");
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Largest(arr);
    }
}
