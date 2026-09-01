package Linear_Search_Array;

import java.util.Scanner;

public class RightRotationArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {3, 14, 25, 65, 37, 98, 56};
        int n =sc.nextInt();   // no.of rotations takes place
        for (int i = 0; i < n; i++) {
            int last = arr[arr.length-1], j;    //Save last
            for (j = arr.length-1; j>0; j--) {
                arr[j] = arr[j-1];     //shift elements
            }
            arr[0] = last; // put last at beginning
        }
        for (int i = 0; i < arr.length; i++) { // repeating rotation n times.
            System.out.print(arr[i] + " ");
        }
    }
}
