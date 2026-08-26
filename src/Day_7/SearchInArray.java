package Day_7;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array");
        int n = sc.nextInt();
        System.out.print("enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        System.out.println("enter the search element:");
        int target=sc.nextInt();
        boolean found=false; //false means target doesn't exist in array
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                System.out.println("target exits in array at index" + i);
                found = true;//target is in array
                break;
            }

            }
        if(found==false){
            System.out.println("target is missing");
        }

    }
}
