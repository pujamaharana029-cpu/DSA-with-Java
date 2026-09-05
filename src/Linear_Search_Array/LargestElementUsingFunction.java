package Linear_Search_Array;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class LargestElementUsingFunction {
    public static int Largest(int arr[], int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max +" ");
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        Largest(arr,n);
    }
}
