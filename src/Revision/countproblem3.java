package Revision;

import java.util.Scanner;

public class countproblem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evensum = evensum + arr[i];
            } else {
                oddsum = oddsum + arr[i];
            }
        }
        System.out.println("Sum of even numbers:" +evensum);
        System.out.println("Sum of odd numbers:" +oddsum);

    }
}
