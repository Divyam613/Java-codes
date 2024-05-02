public class Fabonacci {
    static void fabo(int n, int a, int b){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        fabo(n-1, a, b);
        
    }
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        fabo(n,a,b);
    }
}
