package Day_7;

import java.util.Scanner;

public class MissingInArray2_usingFunctions {
    public static int FindMissingNumber(int [] arr,int n){
        int sumN=(n*(n+1))/2; // sum of numbers from 1 to n
        int sum=0; // sum of array elements
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        // missing number
        return sumN-sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr={1,2,4,7,5,6,8,9,10};
        int answer= FindMissingNumber(arr,n);
        System.out.println("Missing number is:" +answer);
    }
}
