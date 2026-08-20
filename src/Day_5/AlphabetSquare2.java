package Day_5;

import java.util.Scanner;

public class AlphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) ('a' + j- 1) + " ");
              //  System.out.print((char)(j+96) +" ");
            }
            System.out.println();
        }
    }
}
