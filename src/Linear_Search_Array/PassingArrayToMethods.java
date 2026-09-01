package Linear_Search_Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int [] x ={10,3,4,23,45};
        System.out.println(x[1]);
        change(x);
        System.out.println(x[1]);
    }
    public static void change(int [] y){  //pass by reference-same array for x and y
        y[1]=59;
    }
}
