/*                            * * * * *
                            * * * * *
                          * * * * * 
                        * * * * *
                      * * * * *                            */       

import java.util.*;

public class Pattern_10 {
  public static void main(String args[]) {
    int n=5;
    int  i,j;
    for (i=1;i<=n;i++){
      //for spaces//
      for (j=1;j<=n-i;j++){
        System.out.print(" ");
        }
        for(j=1;j<=n;j++){
          System.out.print("*");
        }
    System.out.println();
      }

  }
    
}
