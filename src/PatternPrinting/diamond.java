package PatternPrinting;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {// lines
            for (int j = 1; j <= nsp; j++) {//loop for horizontal space triangle
                System.out.print(" " + " ");
            }
            {
                for (int k = 1; k <= nst; k++) { //vertically star square loop
                    System.out.print("*" + " ");
                }
                nsp--;
                nst += 2;
                System.out.println();
            }
        }
            nsp = 1;
            nst = 2*n-3;
            for (int i = 1; i <= n - 1; i++) {// lines
                for (int j = 1; j <= nsp; j++) {//loop for horizontal space triangle
                    System.out.print(" " + " ");
                }
                {
                    for (int k = 1; k <= nst; k++) { //vertically star square loop
                        System.out.print("*" + " ");
                    }
                    nsp++;
                    nst -= 2;
                    System.out.println();
                }
            }
        }
}