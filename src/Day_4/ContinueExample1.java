package Day_4;

public class ContinueExample1 {
    public static void main(String[] args) {
        for (int i = 1; i <20; i++) {
            System.out.println(i);
            if (i == 12)
             continue;
            System.out.println("gud morning");
        }
    }
}