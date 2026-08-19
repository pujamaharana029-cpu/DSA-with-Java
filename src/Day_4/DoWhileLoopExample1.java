package Day_4;

import java.util.Scanner;

public class DoWhileLoopExample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;// variable scope
        do{
            System.out.println("enter a number");
            n=sc.nextInt();
        }while(n!=0);

    }
}
