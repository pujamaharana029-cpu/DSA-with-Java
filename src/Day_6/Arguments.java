package Day_6;

public class Arguments {
    public static void sum(int a, int b) {//parameters
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sum(5, 8);//arguments
        max(6, 9, 3);
    }

    public static void max(int a, int b, int c) {
//        if(a>b && a>c){
//            System.out.println(a);
//        }else if(b>a && b>c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
