import java.util.*;

public class Multplication_table {
    public static void main(String args[]){
        int i,n,mul=0;
        System.out.println("enter the table u want to print");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=10;i++){
            mul = n*i;
            System.out.println(n+" * "+i+" = "+mul );
        }

    }
    
}
