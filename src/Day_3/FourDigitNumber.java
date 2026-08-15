package Day_3;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number:");
        int n=sc.nextInt();
        if(n>999 && n<100000){
            System.out.println("it is a 4 digit number");
        }else{
            System.out.println("it is not a 4 digit number");
        }
    }
}
