package PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangleHorizontalFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n; //no.of alphabet to be printed in each line
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print((char)('a'+j-1) +" ");
            }
            a--;
            System.out.println( );
        }
    }
}

