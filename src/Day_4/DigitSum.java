package Day_4;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
     //   if (n == 0) n = 1;// zero digit comes zero but it should count as zero
      //  int count = 0;
        int Sum =0;
        while (n != 0) {
            Sum+= (n % 10);//last digit
            n/=10;
        }
        System.out.println((Sum>0)?Sum:-Sum);
    }
}
