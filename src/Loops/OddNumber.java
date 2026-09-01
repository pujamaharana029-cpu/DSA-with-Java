package Loops;
// print all odd numbers divisible by 3 from 1-100.
public class OddNumber {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                if(i%3==0){
                    System.out.println("odd numbers divisible by 3 are:"+i);

                }
            }
        }
    }
}
