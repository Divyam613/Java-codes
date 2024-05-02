package function;

import java.util.Scanner;

public class prime {

    public static String primes(int a){
        if( a==2){
            return "prime";
        }
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(a%i==0){
                return "not prime";
            }
        }
        return "prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(primes(n));
    }
}
