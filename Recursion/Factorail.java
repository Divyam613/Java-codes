public class Factorail {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        int facto = n*fact(n-1);
        return facto;
    }
    public static void main(String[] args) {
        int n=5 ;
        System.out.println(fact(n));
    }
}
