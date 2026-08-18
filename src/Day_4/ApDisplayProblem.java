package Day_4;

import java.util.Scanner;

public class ApDisplayProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // logic-1
       /* for(int i=2;i<=(3*n-1);i+=3){
            System.out.println(i);
        }*/
        //logic-2
        int a=2,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
