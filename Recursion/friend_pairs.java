import java.util.Scanner;

public class friend_pairs {
    static int friend_pair(int n ){
        if(n==1 || n==2){
            return n;
        }

        int possibility=friend_pair(n-1)+(n-1)*friend_pair(n-2);
        return possibility;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no. of peoples");
        int n= sc.nextInt();
        sc.close();
        System.out.println(friend_pair(n));
    }

}
