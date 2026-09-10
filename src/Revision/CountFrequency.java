package Revision;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter elements in the array:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the given number:");
        int givenNumber=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==givenNumber){
                count++;
            }
        }
        System.out.print("Frequency of a given Number: " +count);
    }
}
