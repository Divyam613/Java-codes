import java.util.Scanner;
public class Tilling_prblm {
    static int tile(int n){
       if(n==2 || n==1){
        return n;
       } 
       int verticle = tile(n-1);
       int horizontal = tile(n-2);

       int ways=verticle+horizontal;
       return ways;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght of tile");
        int  n = sc.nextInt();
        System.out.println("no. of ways :"+tile(n));
        sc.close();
    }
}
