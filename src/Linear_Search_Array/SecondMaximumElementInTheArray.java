package Linear_Search_Array;

public class SecondMaximumElementInTheArray {
    public static void main(String[] args) {
        int [] arr={12,34,76,31,46,90,32,11,38,28};
        int max=Integer.MIN_VALUE;
        int SMax=Integer.MIN_VALUE;
        //first Maximum
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
        }
        // calculate second Maximum
        for(int i=0;i<arr.length;i++){
            if(arr[i]>SMax && arr[i]!=max){
                SMax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(SMax);
    }
}
