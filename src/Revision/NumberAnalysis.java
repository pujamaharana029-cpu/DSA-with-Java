package Revision;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int n=sc.nextInt();
        //count Digit
        int count=0;
        int sum=0;
        int reverse=0;
        int Number=n;
        while(n!=0){
            reverse*=10;
            reverse+=(n%10);
            sum+=(n%10);
            n/=10;
            count++;
        }
        System.out.println("Number of digits:" +count);
        //sums of digits
        System.out.println("Sum of digits:" +sum);
        //reverse of number
        System.out.println("Reverse of the number" +reverse);
        //check palindrome
        if(Number==reverse){
            System.out.println("yes,it is a palindrome");
        }else{
            System.out.println("not");
        }
    }
}
