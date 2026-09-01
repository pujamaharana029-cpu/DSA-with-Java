package Methods;

public class ReturnType {
    public static int father(int b){
        System.out.println("working");
        System.out.println("eating");
      if(b>0)  return 6;
      else return 8;
    }
    public static void main(String[] args) {
        int a=father(-2);
       // System.out.println(father());
        System.out.println(3+ a);
      //  father();//stand alone call no return values
    }
}
