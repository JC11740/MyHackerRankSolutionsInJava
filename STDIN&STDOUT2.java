import java.util.Scanner;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt(); // This is 42
        scan.nextLine();
        
        double d = scan.nextDouble(); // This is the double 3.1415
        scan.nextLine();
        
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();        

    }
}
