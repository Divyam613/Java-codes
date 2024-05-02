package Array;

public class Kadanes_law {
    static void kedan(int arr[]){
        int max = Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            if((cs+arr[i])<0){
                cs=0;
            }
            else{
                cs+=arr[i];
            }
            max=Math.max(max, cs);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={2,-3,5,-1,4};
        kedan(arr);
    }
}
