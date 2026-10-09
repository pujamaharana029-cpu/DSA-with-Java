package Revision;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j =1;j<=n-i;j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println( );
        }
        for(int i=n-1;i>=1;i--) {
            for (int l = 1; l <= n - i; l++) {
                System.out.print(" " + " ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
