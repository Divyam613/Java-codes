package Sorting;

public class Countsort {
    static void count(int arr[]){
        int big=Integer.MIN_VALUE;
        //find max element in array
        for(int i=0;i<arr.length;i++){
            big=Math.max(big,arr[i]);
        }

        //allot the count array size
        int count[] = new int[big+1];

        //making count array by setting frequency
        for(int i=0;i<count.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                 arr[j]=i;
                 j++;
                 count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,1,5,2,3,4};
        count(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
