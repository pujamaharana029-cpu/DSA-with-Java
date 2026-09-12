package Linear_Search_Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25); //add meaning adding from backward
        arr.add(21);
        arr.add(45);
        System.out.println(arr.get((2))); //arr[2]
        arr.set(1,50); //arr[1]=50
        System.out.println(arr); //it simply gives answer as used loop *not traversing the array by ourselves
        int n=arr.size();// for arraylist=arr .size but for only array=arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) +" ");
        }
        System.out.println();
        for(int ele :arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        //25 50 45
        arr.add(12); //25 50 45 12
        arr.add(2,13);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        //swap problem
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get((j)));
            arr.set(j,temp);
            i++;
            j--;
        }
      //  Collections.reverse(arr);//swap used
        System.out.println(arr);


    }
}
