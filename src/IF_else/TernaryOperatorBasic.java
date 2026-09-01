package IF_else;

import java.util.Scanner;

public class TernaryOperatorBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number:");
        int n=sc.nextInt();
        //condition? sach:jhoot
        System.out.println((n%2==0)?"even":"odd");
    }
}
