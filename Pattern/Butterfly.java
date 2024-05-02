import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i= 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
            }
            for(int k=n*2; k>=2*i+1; k--){
                System.out.print(" ");              
            }
            for(int l=1;l<=i;l++){
                
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= 1;i<=n;i++){
            for(int j=n;j>=i;j--){
                
                System.out.print("*");
            }
            for(int k=1; k<2*i-1; k++){
                System.out.print(" ");
            }
            for(int l=n;l>=i;l--){
                
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
