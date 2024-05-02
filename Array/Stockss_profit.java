package Array;

public class Stockss_profit {
    static void profit(int arr[]){
        int pre=0;
        int benifit =0;
        for(int i=0;i<arr.length-1;i++){
            
             int bp=arr[i];
            
            int sp=arr[i+1];
             bp=Math.min(sp, bp);
            pre=sp-bp;
            if(pre<0){
                pre=0;
            }
            benifit =benifit+pre;
            
        }
        System.out.println(benifit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        profit(arr);
    }
}
