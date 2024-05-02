package function;

import java.util.Scanner;

public class Compute_number {
    static void sum(int a){
        int fin = 0;
        while(a>0){
            int ld = a%10;
            fin= fin+ld;
            a=a/10;
        }
        System.out.println("sum of the number is:"+fin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}
