package Revision;

public class duplicates_in_array {
    public static void main(String[] args) {
        int [] arr={2,4,5,7,2,4,9,0,1,3,3,2,6,7,4,2};
        int target=arr[0];
        int count;
        for(int i=0;i<arr.length;i++) {
            target = arr[i];
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == target) {
                    count++;
                }
            }
            boolean alreadyseen=false;
            for(int k=0;k<i;k++){
                if(arr[k]==target){
                    alreadyseen=true;
                    break;
                }
            }
            if (count > 1 && !alreadyseen) {
                System.out.println(target + "it is repeated");
            }
        }
    }
}
