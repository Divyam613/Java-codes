package Array;

public class Trapping_rainwater {
    static void trappingrain(int arr[]){
        int left[]= new int[arr.length];
        int right[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=0;j<=i;j++){
                max=Math.max(max, arr[j]);
            }
            left[i]=max;
        }
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=i;j<=arr.length-1;j++){
                max=Math.max(max, arr[j]);
            }
            right[i]=max;
        } 
        int profit=0;
        int trapped=0;
        for(int i=0;i<arr.length-1;i++){
            int min=Math.min(left[i], right[i]);
            profit=min-arr[i];
            if(profit<0){
                profit=0;
            }
            trapped+=profit;
        }            
        System.out.println(trapped);
        
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,5};
        trappingrain(arr);
    }
}
