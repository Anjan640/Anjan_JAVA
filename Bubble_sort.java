
import java.util.*;

public class Bubble_sort {
    
    public static void Bubble(int arr[]) {
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
          //bubble sorting//
             for(int i=0; i<arr.length-1; i++) {
                 for(int j=0; j<arr.length-i-1; j++){
                     if(arr[j] > arr[j+1]){
                         //swapping of elements
                         int temp= arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                     }
                 }
             }
             Bubble(arr);
         
    }
    
}
