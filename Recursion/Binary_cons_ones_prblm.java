public class Binary_cons_ones_prblm {
    public static void main(String[] args) {
        int size = 3;
        String str = "";

        not_consecutive_ones(size, 0,str);
    }

    static void not_consecutive_ones(int n,int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        not_consecutive_ones(n-1,0,str+"0");
        if(lastplace == 0){
            not_consecutive_ones(n-1, 1, str+"1");
        }
    }

}
