package Linear_Search_Array;

import java.util.Arrays;

public class ShallowcopyDeepcopy {
    public static void main(String[] args) {
        int a=4;//it takes 4 bytes
        int[] arr={10,20,30,40,50,60};//it takes 16 bytes
     //   int[] x=arr; //x is shallow copy of arr
     //   x[0]=100;
        int [] deep= Arrays.copyOf(arr,arr.length);//deep copy using built-in method
        deep[0]=200;
        System.out.println(arr[0]);//output-100
    }
}
