package Day_3;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side:");
        int a=sc.nextInt();
        System.out.println("enter second side:");
        int b=sc.nextInt();
        System.out.println("enter third side:");
        int c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
