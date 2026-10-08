package Revision;

public class S_smallestofarray {
    public static void main(String[] args) {
        int [] arr={7,3,9,1,5};
        int smallest=arr[0];
        int s_smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                s_smallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<s_smallest && arr[i]!=smallest){
                s_smallest=arr[i];
            }
        }
        System.out.println(s_smallest);
    }
}
