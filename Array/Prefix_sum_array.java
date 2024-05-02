package Array;

public class Prefix_sum_array {
    static void prefixarr(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        //making prefix array
        prefix[0]=arr[0];
        for(int i=1; i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                int subsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(subsum);
                // if(maxsum<subsum){
                //     maxsum=subsum;
                // }
                //OR
                maxsum=Math.max(maxsum,subsum);
            }
        }
        System.out.println("maximum sum is:"+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,-3,5,-1,4};
        prefixarr(arr);
    }
}
