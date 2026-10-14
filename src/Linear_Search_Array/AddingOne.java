package Linear_Search_Array;

import java.util.Scanner;

public class AddingOne {
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
        while (i >= 0 && arr[i] == 9) {
            arr[i] = 0;
            i--;
        }
        if (i >= 0) {
            arr[i]++;
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
        }else{
                int[] result = new int[n + 1];
                result[0] = 1;
                for (int j = 0; j < n+1; j++) {
                    System.out.print(result[j] + " ");
                }
            }
        }
    }

