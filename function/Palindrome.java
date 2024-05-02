package function;

import java.util.Scanner;

public class Palindrome {

    static int rev(int a){
        int fin = 0;
        while(a>0){
            int ld = a%10;
            fin= fin*10+ld;
            a=a/10;
        }
        return fin;
    }
    static boolean ispalin(int a){
        if(rev(a)==a){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        System.out.println(ispalin(n));
        sc.close();
    }
}
