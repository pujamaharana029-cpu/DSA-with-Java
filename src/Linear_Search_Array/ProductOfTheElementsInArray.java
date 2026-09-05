package Linear_Search_Array;

import java.util.Scanner;

public class ProductOfTheElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Size of Array:");
        int n=sc.nextInt();
        System.out.println("enter Elements in the array:");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        int product=1;
        for(int i=0;i<arr.length;i++) {
            product *= arr[i];
        }
            System.out.println(product+" ");
    }
}
