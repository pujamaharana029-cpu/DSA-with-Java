package Day_7;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr={2,9,4,-3,2,-87,56,83,5};
//        System.out.println(arr.length);//size of array
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }
        int [] Bird= new int[7];
        // Default values
     //   for(int i=0;i<7;i++){
      //      System.out.print(Bird[i] +" ");
      // }
        //input
        for(int i=0;i<7;i++){
            int x=sc.nextInt();
            Bird[i]=x;
        }
        //output print
        for(int i=0;i<7;i++){
            System.out.println(Bird[i] +" ");
            System.out.print(2*Bird[i] +" ");
        }
    }
}
