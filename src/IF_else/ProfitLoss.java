package IF_else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cp: ");
        int cp=sc.nextInt();//cost price
        System.out.println("enter sp: ");
        int sp=sc.nextInt();//selling price
    /* Method-1
       if(sp>cp){
            System.out.println("Profit is " +(sp-cp));
        }if(cp>sp){
            System.out.println("loss is " +(cp-sp));
        }if(sp==cp){
            System.out.println("no profit no loss");
        }*/
        //Method-2
        if(sp>cp){
            System.out.println("profit is "+(sp-cp));
        }else if(cp>sp){
            System.out.println("loss is "+(cp-sp));
        }else{
            System.out.println("no profit no loss");
        }
    }
}
