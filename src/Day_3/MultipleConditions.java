package Day_3;

import java.util.Scanner;

public class MultipleConditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number:");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0){ //Or condition applied
            System.out.println("Divisible by 5 or 3");
        }else{
            System.out.println(" not Divisible by 5 or 3");
        }
    }
}
