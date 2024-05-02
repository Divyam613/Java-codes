package function;
import java.util.*;

public class dec_to_bin {
    static void dectobin(int n ){
        int bin=0;
        int pow=0;
        while(n>0){
            int r = n%2;
            bin = bin + (r*(int)Math.pow(10,pow));
            n = n/2;
            pow++;
        }
        System.out.println("binary number is : "+ bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        dectobin(n);
        sc.close();
    }
}
