import java.util.*;

public class Do_while_basic {
    public static void main(String args[]){
        int i=1,n,sum=0;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    
        do{
            sum = sum +i;
            i++;
        } while(i<n);
        System.out.println(sum);
    }
}
