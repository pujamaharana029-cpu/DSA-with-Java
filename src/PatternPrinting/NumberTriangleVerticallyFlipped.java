package PatternPrinting;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {//loop for horizontal space triangle
                System.out.print(" "+" ");
            }
            {
                for(int k=1;k<=i;k++){ //vertically star triangle loop
                    System.out.print(k +" ");
                }
            }
            System.out.println( );
        }
    }
}
