/*                *
                 **
                ***
               ****                */  

import java.util.*;

public class Pattern_5 {
    public static void main(String args[]){
    int n = 4;
     for(int i=1; i<=n; i++) {                     // outer loop 
        // for printing spaces
         for(int j=1; j<=n-1 ; j++) {
             System.out.print(" ");
         }
         // for printing *
     for( int j=1; j<=i; j++){
         System.out.print("*");
     }
     System.out.println("");
        }
       

    }
    
}
