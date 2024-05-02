package function;

import java.util.*;

public class binary_to_decimal {
    static void bin_to_deci(int a){
        
        int pow=0;
        int ans=0;
        while(a>0){
            int r=a%10;
            ans=ans + (r*(int)Math.pow(2 , pow));
            pow++;
            a=a/10;          
        }
        System.out.println("decimal is:" + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bin_to_deci(n);
        
        sc.close();
    }
}
