import java.util.Scanner;

public class Palindromic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i= 1;i<=n;i++){
            for(int k=n; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                
                System.out.print(j);
            }
            
            for(int l=2;l<=i;l++){
                
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
}
