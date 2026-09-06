package Revision;

import java.util.Scanner;

public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start:");
        int start = sc.nextInt();
        System.out.print("End:");
        int end = sc.nextInt();
        int count=0;
        for (int num = start; num <= end; num++) {
           int factors=0;
           for (int i =1; i <=num; i++) {
               if (num % i == 0) {
                   factors++;
               }
           }
           if(factors==2){
                    System.out.print(num +" ");
                    count++;
            }
        }
        System.out.println();
        System.out.println("Total prime numbers:" +count);
    }
}
