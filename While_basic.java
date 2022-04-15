import java.util.*;

public class While_basic {

    public static void main(String args[]){
        int i=1,n,sum=0;
        System.out.println("enter the value u want to print");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
    
}
