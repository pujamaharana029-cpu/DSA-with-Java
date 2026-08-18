package Day_4;

import java.util.Scanner;
// break statement uses
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int x=0;//x=0 means prime
     //   for(int i =2;i<=n-1;i++){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){//i to n factor
                x=1;//x=1 means composite
                break;
            }
        }if(x==1){
            System.out.println("composite number");
        }else{
            System.out.println("prime number");
        }
    }

}
