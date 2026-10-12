import java.util.Scanner;

public class array_practice_questions {
    //find the second-largest distinct element in array
//    public static void main(String[] args) {
//        int[] arr={4,12,78,23,78,33,9,15};
//        int largest=arr[0];
//        int second_largest=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>largest){
//                second_largest=largest;
//                largest=arr[i];
//            }
//            else if(arr[i]>second_largest && arr[i]!=largest) {
//                second_largest = arr[i];
//            }
//        }
//        System.out.println(second_largest);
//
//
//    }
    // moves zeroes to end
 /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        System.out.print("enter elements in the array:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;

        //Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        //fill th remaining positions with zero
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("Array after moving zeroes:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/
    //find the missing number
 /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {3, 7, 1, 2, 8, 4, 5};
        int sumN = (n * (n + 1)) / 2; //Sum of N numbers.
        int sum = 0; // to store sum of array elements.
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        //finding Missing number
        int missing_value = sumN - sum;
        System.out.println("Missing value is:" + missing_value);
    }*/
}

