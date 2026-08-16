package Day_3;

import java.util.Scanner;
public class QuadrantProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st coordinate:");
        int x=sc.nextInt();
        System.out.println("enter 2nd coordinate");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("origin");
        }else if(x>0 && y>0){     // (+,+)
            System.out.println("1st Quadrant");
        }else if (x<0 && y>0){  //(-,+)
            System.out.println("2nd Quadrant");
        }else if (x<0 && y<0){ //(-,-)
            System.out.println("3rd Quadrant");
        }else if(x>0 && y<0){  //(+,-)
            System.out.println("4th Quadrant");
        }else if(y==0){  //(+/- ,0)
            System.out.println("x-axis");
        }else{  // (0,+/-)
            System.out.println("y-axis");
        }
    }
}
