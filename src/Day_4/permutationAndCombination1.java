package Day_4;

import java.util.Scanner;

public class permutationAndCombination1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        System.out.println("enter r:");
        int r = sc.nextInt();
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        int rfact = 1;
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        int nrfact = 1;
        for (int i = 1; i <= n-r; i++) {
            nrfact *= i;
        }
        int nCr = nfact / (rfact * nrfact);
        int nPr=nfact/nrfact;
        System.out.println(nCr);
    }
}

