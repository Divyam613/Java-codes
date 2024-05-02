import java.util.Scanner;

public class Floyed_triangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        sc.close();
        int nump=1;
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(nump + " "); nump++;
                
            }
            System.out.println();
        }
    }
}
