package DatatypesAndOperator;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal amount:");
        double p=sc.nextInt();
        System.out.println("enter the time:");
        double t=sc.nextInt();
        System.out.println("enter the rate:");
        double r=sc.nextInt();
        System.out.println("simple interest:");
        System.out.println((p*t*r)/100);
    }
}
