
import java.util.*;

public class Selection_sort {
    
    public static void Selection(int arr[]) {
        System.out.print("array after sorting");
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];       // array declaration

        //inputing an array
        System.out.println("enter the elements of an array");
         for(int i=0; i< arr.length; i++){
             arr[i] = sc.nextInt();
         }
         // printing an array
         System.out.println("array before sorting");
         for(int i=0;i<arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
          //Selection sorting//
          for(int i=0; i< arr.length-1; i++){
              int smallest = i;
              for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
              }
        //swapping
            int temp= arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            }
        Selection(arr);
}
    
}

