public class Incr_order {
    static void inc(int n ){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n =50;
        inc(n);
    }
}
