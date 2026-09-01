package IF_else;
import java.util.Scanner;
public class IntegerCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        double n=sc.nextDouble();//n=3.12
        int x=(int)n;//x=3(type conversion)
        if(n-x>0){
            System.out.println("it is not an integer");
        }
        else{
            System.out.println("it is an integer");
        }
    }
}
