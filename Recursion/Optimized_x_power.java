public class Optimized_x_power {
    static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int half = power(x, n/2);
        int halfseq=half*half;

        if(n%2 !=0){
            halfseq= x*halfseq;
        }
        return halfseq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(power(x,n));
    }
}
