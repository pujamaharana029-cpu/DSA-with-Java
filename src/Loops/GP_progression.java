package Loops;

import java.util.Scanner;

public class GP_progression {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("n=");
        int n=sc.nextInt();
        int a=1,r=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
    }
}
