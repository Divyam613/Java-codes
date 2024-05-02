public class Try {
    public static void main(String[] args) {
        int n=1456;
        for(int i=3;i>=0;i--){
            int p=n/(int)Math.pow(10,i);
            n=n-p*(int)Math.pow(10,i);
            System.out.println(p);
        }
    }
}


int count =0;
        int[] arr= new int[4];
        int tnum=num1;
        for(int i=3,j=0;i<=0;i--,j++){
            int p=tnum/(int)Math.pow(10,i);
            arr[j] = p;
            tnum=tnum-p*(int)Math.pow(10,i);
        }
        while(num1!=num2){
            for(int i: arr){
                int numt = num1; tnum=num1;
                for(int j=0,k=3;j<4;j++,k--){
                    int p=tnum/(int)Math.pow(10,k);
                    tnum=tnum-p*(int)Math.pow(10,i);
                    int m= p*(int)Math.pow(10,k);
                    numt=numt-m;
                    numt+=i*(int)Math.pow(10,k);
                    if(isprime(numt)){
                        num1=numt;
                        
                        count++;
                        break;
                    }
                }
                System.out.println(num1);
                if(num1==num2){
                    break;
                }
            }
        }
        return count;