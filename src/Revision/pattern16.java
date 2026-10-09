package Revision;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i-1;j--){
                System.out.print(" " +" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(k +" ");
            }
            System.out.println( );
        }
    }
}
