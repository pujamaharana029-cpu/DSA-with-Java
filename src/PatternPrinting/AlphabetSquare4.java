package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) ('A' + i - 1) + " ");
            }
            System.out.println();
        }
    }
}
