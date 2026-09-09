package Revision;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("search element:");
        int SearchElement=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == SearchElement) {
                count++;
            }
        }
        System.out.println("Number of elements that are equal to the search element:" +count);
    }
}
