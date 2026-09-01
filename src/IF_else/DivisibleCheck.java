package IF_else;

import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a any positive number:");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("n is divisible by 5");
        }else{
            System.out.println("n is not divisible by 5");
        }
    }
}
