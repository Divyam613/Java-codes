import java.util.Scanner;

public class Num_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        sc.close();
        for(int i= 0;i<=n;i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
