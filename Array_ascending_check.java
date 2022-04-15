import java.util.*;

public class Array_ascending_check {
    public static void main(String args[]) {
        System.out.println("enteer the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        //for input
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // for output
        for(int i=0; i< size; i++ ) {
            System.out.print(arr[i] + " ");
        }
        boolean isAscending= true;
        
        for(int i= 0; i< arr.length - 1 ; i++) {// termination condition
             if(arr[i] > arr[i+1]) {
                 isAscending = false;
             }
        }
        if(isAscending) {
            System.out.println("the array is in ascending");
        }
        else{
            System.out.println("the aray is not in ascending");
        }
    }
}
