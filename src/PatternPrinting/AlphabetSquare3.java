package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) ('a' + i - 1) + " ");
                } else {
                    System.out.print((char) ('A' + i - 1) +" ");
                }
            }
            System.out.println();
        }
    }
}
