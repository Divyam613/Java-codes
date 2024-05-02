package function;

import java.util.Scanner;

public class Avg_of_three {
    static void Avg(int a, int b, int c){
        float avgr =(a+b+c)/3.0f;
        System.out.println("avrage of the nummber is"+avgr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Avg(a,b,c);
        sc.close();
    }
}
