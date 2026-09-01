package IF_else;

import java.util.Scanner;

public class LeastOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();
        if(a<b){ //b is not max to a
            if (a<c) {
                System.out.println("least=" +a);
            }else{
                System.out.println("least="+c);
            }
        }else{
            if(b<c){
                System.out.println("least="+b);
            }else{
                System.out.println("least=" +c);
            }
        }
    }
}
