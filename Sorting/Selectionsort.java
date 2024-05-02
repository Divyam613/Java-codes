package Sorting;

public class Selectionsort {
    static void slct(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            // int min =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                } 
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,9,1,2,6,8};
        slct(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
