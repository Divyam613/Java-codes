public class Sum_of_n {
    static int sum(int n){
        int sums=0;
        if(n==0){
            return 0;
        }
        sums = n+sum(n-1);
        return sums;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }
}
