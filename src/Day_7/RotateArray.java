package Day_7;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr ={3,14,25,65,37,98,56};
        int n=arr.length;
        for(int i=0;i<3;i++){
            //swap arr[i] and arr[n-1-i]
            int temp=arr[0];
            arr[1]=arr[2];
            arr[2]=temp;
        }
        for(int i=3;i<n-1;i++){
            //swap arr[i] and arr[n-1-i]
            int temp=arr[3];
            arr[3]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int ele:arr){
            System.out.print(ele +" ");
        }

    }
}
