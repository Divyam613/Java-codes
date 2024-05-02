package Array;

public class Max_sum_Subarray {
    static void maxsub(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                int subsum=0;
                for(int k=i;k<=j;k++){
                    //sum of single subarray
                    subsum+=arr[i];
                }
                System.out.println(subsum);
                if(maxsum<subsum){
                    maxsum=subsum;
                }
            }
        }
        System.out.println("maximum sum is:"+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,-3,5,-1,4};
        maxsub(arr);
    }
}
