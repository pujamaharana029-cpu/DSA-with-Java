package Revision;

import java.util.Scanner;

public class SecondLargestInTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Smax && arr[i]!=max){
                Smax=arr[i];
            }
        }
        System.out.println("Second Largest element in the array : " +Smax);
    }
}
