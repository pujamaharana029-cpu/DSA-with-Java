package Revision;

import java.util.Scanner;

public class countProblem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter elements in the array:");
        int arr[]=new int[n];
        int positivecount=0;
        int negativecount=0;
        int zerocount=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                positivecount++;
            }else if(arr[i]<0){
                negativecount++;
            }else{
                zerocount++;
            }
            } System.out.println("Positive=" +positivecount);
        System.out.println("Negative=" +negativecount);
        System.out.println("Zero=" +zerocount);
    }
}
