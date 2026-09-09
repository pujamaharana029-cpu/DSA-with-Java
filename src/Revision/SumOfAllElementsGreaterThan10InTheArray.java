package Revision;

import java.util.Scanner;

public class SumOfAllElementsGreaterThan10InTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 10) {
                sum += arr[i];
            }
        }
        System.out.println("sum of all elements greater than 10:  " +sum);
    }
}
