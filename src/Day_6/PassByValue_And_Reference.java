package Day_6;

public class PassByValue_And_Reference {
    public static void change(int x){
        x=10;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x=6;
        System.out.println(x);
        change(x);//pass by value
        System.out.println(x);
    }
}