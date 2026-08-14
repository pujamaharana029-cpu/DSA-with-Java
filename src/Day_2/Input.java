package Day_2;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input
        System.out.println("enter radius of circle:");
        double r = sc.nextDouble();
        double a = 3.1415 * r * r;
        System.out.println("Area Of Circle:");
        System.out.println(a);

// sum of two numbers
        System.out.println("enter the first no.:");
        int c = sc.nextInt();
        System.out.println("enter second no.:");
        int b = sc.nextInt();

        System.out.println("sum of two numbers:");
        System.out.println(c + b);
    }
}
