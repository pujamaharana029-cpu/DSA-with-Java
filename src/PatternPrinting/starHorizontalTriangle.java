package PatternPrinting;

import java.util.Scanner;

public class starHorizontalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // logic-1
//        for(int i=1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print("*" +" ");
//            }
//            System.out.println( );
//        }
        //logic-2
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
