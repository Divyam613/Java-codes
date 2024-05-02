public class Zero_one {
    public static void main(String[] args) {
         int n=1;
        for(int i= 1;i<=5;i++){
            int m = n;
            for(int j=1;j<=i;j++){
                if(m==1){
                    m=0;
                }
                else{
                    m=1;
                }
                System.out.print(m);
            }
            if(n==1){
                    n=0;
                }
                else{
                    n=1;
                }
            System.out.println();
        }
    }
}
