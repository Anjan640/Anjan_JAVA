/*                1
                 2 2
                3 3 3
               4 4 4 4
              5 5 5 5 5               */   

import java.util.*;

public class Pattern_11 {
    public static void main(String args[]) {
        
        int n=5;
        for(int i=1; i<=n; i++){
        //for spaces//
            for(int j=1;j<=n-i; j++) {
                System.out.print(" ");
        }
        // for number which is euqal as row//
        for(int j=1 ; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
        }
    }    
}
