
import java.util.*;

public class Function_basic {
    public static void printMyName( String name) {              // function defination
        System.out.println(name);
    }

public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printMyName(name);         // calling the functions 
}

    
}
