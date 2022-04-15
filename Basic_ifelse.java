import java.util.*;

public class Basic_ifelse
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        
        if (a==b)
        {
            System.out.println("equal");

        }
        else if(a>b) {
            System.out.println("a is greater");  
           
            }
            else{
                System.out.println("b is greater");
            }    
        
        
    }
    
}
