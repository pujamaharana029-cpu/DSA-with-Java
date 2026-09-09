package Revision;

import java.util.Scanner;

public class AverageOfAllElementsInTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int sum=0;
        double Average=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
             sum+= arr[i];
             Average = (double)sum / n;
        }
        System.out.println("Average:" +Average);
    }
}
