import java.util.*;

public class Array_basic {
    public static void main(String args[]) {
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int numbers[] = new int[size];
        //inputing arary  
         for(int i=0; i < size; i++) {
              numbers[i] = sc.nextInt();
         }
         // for printing an array
         for(int i=0; i<size; i++) {
             System.out.print(numbers[i] + " " + "\n");
         }
// for searcing//
    System.out.println("enter the digit u want to sesarch");    
    int x = sc.nextInt();
         for(int i=0; i< numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found in" + " " + i);
            }
         }


        }
    
}
