
import java.util.*;

public class Insertion_sort {
    
    public static void Insertion(int arr[]) {
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
          //Insesrtion sorting//
          for(int i=1; i< arr.length; i++){
              int current = arr[i];
              int j = i-1;
              while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
              }
                //placement
            arr[j+1] = current;
            }
        Insertion(arr);
}
    
}

