package Linear_Search_Array;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        //sort-ascending order
        int[] arr={2,5,7,8,-3,19,10};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
}
