import java.util.*;

public class For_basic {

    public static void main(String args[]){
        int i,n,sum=0;
        System.out.println("enter the value or 'n'");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt() ; 

        for(i=0;i<n;i++){
            sum = sum + i;
        }
        System.out.println( sum+ "" );
    }
    
}
