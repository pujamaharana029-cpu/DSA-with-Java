package Day_4;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("numbers are");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
