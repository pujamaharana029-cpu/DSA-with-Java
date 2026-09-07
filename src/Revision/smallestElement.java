package Revision;

import java.util.Scanner;

public class smallestElement {
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
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest element in the array:" +min);
    }
}
