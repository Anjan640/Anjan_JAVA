
import java.util.*;

public class TwoD_arrsy_basic {
    public static void main (String args[]) {
        System.out.println("enter row and coloumn");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
       // defining a 2d array
        int numbers[][] = new int [row][column];
        
        //inputing an 2D array
        System.out.println("the elements of the array is");
        for(int i=0; i<row; i++) {
            for(int j=0; j< column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //printing an 2D array
        System.out.println("the aray is");
        for(int i=0; i<row; i++) {
            for(int j=0; j< column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();     
         }
  // for searching elements
      System.out.println("enter thr element u want to search");
      int x = sc.nextInt();

         for(int i=0; i<row; i++) {
            for(int j=0; j< column; j++) {
                //compare with x
                if(numbers[i][j] == x) {
                    System.out.print("the x found at location" + i + "," + j);
                }
               
            }
            
         }


    }
    
}
