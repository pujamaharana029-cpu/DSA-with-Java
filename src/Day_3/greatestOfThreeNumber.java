package Day_3;

import java.util.Scanner;

public class greatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();
        //with multiple conditions logic-1
        /*if(a>=b &&a>=c){
            System.out.println("a is greater than b and c");
        }else if(b>=a && b>=c){
            System.out.println("b is greater than a and c");
        }else{
            System.out.println("c is greater than a and b");
        }*/
        // without multiple conditions , using nested if-else logic-2
        if(a>b){ //b is not max to a
            if (a>c) {
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
       //used ternaryOperator
        // System.out.println( (a>b)?((a>c)? a:c):((b>c)?b:c));
    }
}
