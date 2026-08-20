package Day_5;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows:");
        int row=sc.nextInt();
        System.out.println("enter no.of columns:");
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){  // how many lines should there
            for(int j=1;j<=col;j++) { //each line how many print
                System.out.print(" *  ");
            }
            System.out.println( );
        }
    }
}
