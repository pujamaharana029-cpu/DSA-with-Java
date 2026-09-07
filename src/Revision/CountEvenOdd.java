package Revision;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
           if(arr[i]%2==0){
               evencount++;
           }else{
               oddcount++;
           }
        }
        System.out.println("even=" +evencount);
        System.out.println("odd=" +oddcount);
    }
}
