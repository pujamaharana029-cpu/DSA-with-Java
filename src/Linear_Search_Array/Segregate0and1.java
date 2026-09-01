package Linear_Search_Array;

public class Segregate0and1 {  //zero at left side and one at right side
    public static void segregate(int []arr){
        int numberOfZeroes=0;
        int numberOfOnes=0;
        for(int ele :arr) { //count no.of zeroes and ones
            if (ele == 0)
                numberOfZeroes++;
        }
            for(int i=0;i<arr.length;i++){
                if(i<numberOfZeroes){ //Travelling in array and comparing each element with i
                    arr[i]=0;
                }else{
                    arr[i]=1;
                }
            }
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
            }
        }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 1};
        segregate(arr);
    }
}
