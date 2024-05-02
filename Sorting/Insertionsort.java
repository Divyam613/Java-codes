package Sorting;

public class Insertionsort {
    static void Insertsrt(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            // int min =arr[i];
            for(int j=i;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    //swap
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                } 
                
            }
            for( int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={3,9,1,2,6,8};
        Insertsrt(arr);
        
    }
}
