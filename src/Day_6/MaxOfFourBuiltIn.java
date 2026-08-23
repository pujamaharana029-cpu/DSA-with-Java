package Day_6;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First no. :");
        int a=sc.nextInt();
        System.out.println("Enter Second no. :");
        int b=sc.nextInt();
        System.out.println("Enter Third no. :");
        int c=sc.nextInt();
        System.out.println("Enter Third no. :");
        int d=sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
