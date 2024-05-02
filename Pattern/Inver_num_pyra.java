import java.util.Scanner;

public class Inver_num_pyra {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        sc.close();
        for(int i= 0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
