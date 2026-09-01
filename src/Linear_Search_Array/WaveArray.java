package Linear_Search_Array;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Wavearray(arr);
    }
    public static void Wavearray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            if(i%2==0){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else{
                if(arr[i+1]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                };
            }
        }
        for(int ele :arr){
            System.out.print(ele);
        }

    }

}
