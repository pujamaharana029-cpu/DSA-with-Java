package Day_5;

import java.util.Scanner;

import static java.lang.Math.min;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){ //1st part
            for(int j=1; j<=2*n-1; j++){
                int a=i,b=j;
               if(i>n) a=2*n-i;
               if (j>n)b=2*n-j;
               System.out.print( Math.min(a,b) +" "); // logic1
                   // System.out.print(b +" ");
                }
            System.out.println();
            }
        }
    }
