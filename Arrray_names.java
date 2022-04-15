import java.util.*;

public class Arrray_names {
    public static void main(String args[]){
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        
        // inputing into the array
        for(int i=0; i<size; i++) {
             names[i] = sc.next(); 
        }
         // for printing
         for(int i=0; i<size; i++) {
            System.out.println(" name in " + (i+1) + " is " + names[i]);
         }
    }
    
}
