package apna_collage.Bitmanupulation;

public class clrith_bit {
    static int clr(int n,int i){
        int manupulate = ~(1<<i);
        int fin = n&manupulate;
        return fin;
    }
    public static void main(String[] args) {
        int n=5;
        int i=2;
        System.out.println(clr(n, i));
    }
}
