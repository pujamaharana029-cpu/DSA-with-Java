package Day_5;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();

       for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
       int nsp =1;
        for (int i = 1; i <= n - 1; i++) {// lines
            for (int j = 1; j <= n-i; j++) {//loop for horizontal space triangle
                System.out.print("*" +" ");
            }
            for (int k = 1; k <= nsp; k++) { //vertically star square loop
                System.out.print(" " +" ");
            }
            for (int j= 1; j <= n-i; j++) {
                System.out.print("*" +" ");
            }
            nsp += 2;
            System.out.println();
            }
        }
    }
