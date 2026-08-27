package Day_7;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={6,9,8,3,1,5,4,7,12};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele :arr){
            System.out.print(ele +" ");
        }

    }
}
