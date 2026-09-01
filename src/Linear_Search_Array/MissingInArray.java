package Linear_Search_Array;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr={3,7,1,2,8,4,5};
        int sumN=(n*(n+1))/2; //Sum of N numbers.
        int sum=0; // to store sum of array elements.
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        //finding Missing number
        int missing_value=sumN-sum;
        System.out.println("Missing value is:" +missing_value);
    }
}
