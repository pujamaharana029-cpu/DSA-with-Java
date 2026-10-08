package Revision;

import org.w3c.dom.ls.LSOutput;

public class slargest_of_array {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9, 6};
        int largest = arr[0];
        int s_largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                s_largest = largest;
                largest = arr[i];
            } else if (arr[i] > s_largest && arr[i] != largest) {
                s_largest = arr[i];
            }
        }
        System.out.println(s_largest);
    }

}
