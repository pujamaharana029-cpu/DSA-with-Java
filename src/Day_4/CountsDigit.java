package Day_4;

import java.util.Scanner;

public class CountsDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n==0)n=1;// zero comes zero but it should count as zero
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
