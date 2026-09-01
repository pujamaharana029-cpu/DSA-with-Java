package IF_else;

import java.util.Scanner;

public class MagnitudeProblem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        // logic-1
       /* if(-n<=69){
            System.out.println("integer is smaller than 69");
        }else{
            System.out.println("integer is greater than 69");
        }*/
        //logic-2
        if(n<69 && n>-69){
            System.out.println("Magnitude is smaller than 69");
        }else{
            System.out.println("magnitude is greater than 69");
        }
    }
}
