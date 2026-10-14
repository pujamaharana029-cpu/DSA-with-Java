package Linear_Search_Array;

import java.util.Scanner;

public class subtractingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = n - 1;
        //change trailing zeroes to 9
        while (i >= 0 && arr[i] == 0) {
            arr[i] = 9;
            i--;
        }
        // subtract 1 from the first
        if (i >= 0) {
            arr[i]--;
        }
        int result = 0;
        while (result < n - 1 && arr[result] == 0) {
            result++;
        }
        // print the answer without leading zeroes
        for (int j = result; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }
}



