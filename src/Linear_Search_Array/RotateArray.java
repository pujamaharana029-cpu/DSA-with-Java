package Linear_Search_Array;

import java.util.Scanner;

public class RotateArray { //left rotation
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {3, 14, 25, 65, 37, 98, 56};
        int n =sc.nextInt();   // no.of rotations takes place
        for (int i = 0; i < n; i++) {
            int first = arr[0], j;    //Save first
            for (j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j +1];     //shift elements
            }
            arr[arr.length -1] = first; // put first at End
        }
        for (int i = 0; i < arr.length; i++) { // repeating rotation n times.
            System.out.print(arr[i] + " ");
        }
    }
}