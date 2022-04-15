/*                 1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4
           5 4 3 2 1 2 3 4 5                 */    

import java.util.*;
public class Palindrome_pattern {
    public static void main(String args[]){
        int n=5;
        //outer loop//
        for(int i=1;i<=n;i++){
            //for spaces//
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for 1st half numbers//
            for( int j=i; j>=1;j--) {
                System.out.print(j);
            }
            //for 2nd half//
            for( int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
