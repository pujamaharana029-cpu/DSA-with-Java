package IF_else;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number:");
        int n=sc.nextInt();
        // program to print peron=100 if n is greater than equal to zero,if not then print person=0
        int person=(n>=0)?100:0;
        System.out.println(person);
    }
}
