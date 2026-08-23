package Day_6;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a:" +a+"and b:" +b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        System.out.println("before swapping a:"+a+"and b:" +b);
        swap(a,b);
      //  System.out.println("After swapping a:" +a+"and b:" +b);
    }
}
