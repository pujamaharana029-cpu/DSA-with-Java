package Revision;

import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.print("enter elements in the array:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int index=0;

        //Move non-zero elements to the front
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        //fill th remaining positions with zero
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println("Array after moving zeroes:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
