package Loops;

import java.util.Scanner;

public class BreakExample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==7){
                break;
            } System.out.println(i);
        }
    }
}
