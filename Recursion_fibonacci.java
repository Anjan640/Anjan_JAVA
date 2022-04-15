
public class Recursion_fibonacci {
  public static void printfib(int a ,int b, int n){    // a ins first term and b is second term and n for last term
        if(n == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printfib(b , c , n-1);
}
 
     public static void main(String args[]) {
        int a = 0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 10;
        printfib(a, b, n-2);
 }   
}
