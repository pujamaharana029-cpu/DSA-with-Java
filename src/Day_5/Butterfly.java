package Day_5;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=2*n-2;
        // Upper part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" " +" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }
            nsp-=2;
            System.out.println( );
        }
        //Lower part
        nsp=2;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*" +" ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" " +" ");
            }
            for(int j=1; j<=n-i;j++){
                System.out.print("*" +" ");
            }
            nsp+=2;
            System.out.println( );
        }
    }
}