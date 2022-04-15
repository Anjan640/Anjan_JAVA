import java.util.*;
public class Twod_array_transpose {
    public static void main(String args[]){
        System.out.println("enter the row and column of the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloumn = sc.nextInt();
        int matrix[][]= new int [row][coloumn];  // 2d array defination
        // for inputing the 2d matrix
        System.out.println("enter the element of the matrix");
        for(int i=0; i< row; i++){
            for(int j=0; j<coloumn; j++){
            matrix[i][j]= sc.nextInt();
            }
        }
        // for printing the matrix
     System.out.println("the matrix is ");
        for(int i=0; i<row; i++){
            for(int j=0; j < coloumn; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
        // for transpossee
        System.out.println("the trnspose of the matrix is");
        for(int j=0; j< coloumn; j++){
            for(int i=0; i< row; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
