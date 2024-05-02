package apna_collage.Bitmanupulation;

public class Setith_bit {
    static int set(int n,int i){
        int manupulate = 1<<i;
        int fin = n|manupulate;
        return fin;
    }
    public static void main(String[] args) {
        int n=00001;
        int i=2;
        System.out.println(set(n, i));
    }
}
