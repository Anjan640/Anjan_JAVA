import java.util.*;

public class Reverse_string {
    public static void main(String args[]) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);
        
        for(int i=0; i<= sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1- i;            // 5-1-0= 4
            //specifying  the element in front and back 
            char frontChar= sb.charAt(front);
            char backChar = sb.charAt(back);

            // intercharging the elements from i to i-1
            sb.setCharAt(front,backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }
    
}
