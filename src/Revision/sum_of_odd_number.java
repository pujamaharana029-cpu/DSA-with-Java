package Revision;

public class sum_of_odd_number {
    public static void main(String[] args) {
        int[] arr={5,8,11,4,4,7,10,13};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        } System.out.println(sum);
    }
}
