package Day_4;

public class basicLoops {
    public static void main(String[] args) {
       //basic
        // for(int i=1;i<=10;i++){   // intialization;condition;increment/decrement
           // System.out.println(i+"."+ "I'm learning");
       // }
        //Global scope:- if we declare outside the loop we may print anything outside the loop.
        int i;
        for(i=1;i<=9;i++){
            System.out.println(i+ " ");
        }
        System.out.println( );
        System.out.println(i);
    }
}
