package Methods;

public class Syntax {
    public static void Animal(){
        System.out.println("dog");
        for(int i=1;i<=7;i++) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {//Main function - it runs first
        pet();
        System.out.println("cat");
         Animal();
    }
        public static void pet() {
            System.out.println("mouse");
            //   Animal();
        }

}
