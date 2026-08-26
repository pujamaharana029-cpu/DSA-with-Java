package Day_7;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //Size of array
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ //input values in array
            int x=sc.nextInt();
            arr[i]=x;
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+10 +" ");//if even, add 10
            }else{
                System.out.print(arr[i]*2 +" ");//if odd,multiply 2
            }
        }
        System.out.println();
    }
}
