package Revision;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }else{
                min=arr[i];
            }
            }
        System.out.println("Largest element in the array:" +max);
        System.out.println("Smallest element in the array:"+min);

    }
}
