import java.util.*;

public class Switch_basic {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter urs choice");
        int button = sc.nextInt();
        
       switch(button){
           case 1: System.out.println("hello");
           break;
           case 2: System.out.println("namaste");
           break;
           case 3: System.out.println("bonjur");
           break;
           default: System.out.println("wrong choice");
       }
    }
    
    
}
