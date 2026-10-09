package Revision;

import java.util.Scanner;

public class patern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*" +" ");
            }
            System.out.println( );
        }
    }
}
