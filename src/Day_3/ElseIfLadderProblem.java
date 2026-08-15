package Day_3;

import java.util.Scanner;

public class ElseIfLadderProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter positive integer:");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0) {// priority order or else error in answer
            System.out.println("number is divisible by both ");
        }else if(n%5==0){
            System.out.println("number is divisible by 5");
        }else if(n%3==0){
            System.out.println("number is divisible by 3");
        }else{
            System.out.println("number is not divisible by 5 0r 3");
        }

    }
}
