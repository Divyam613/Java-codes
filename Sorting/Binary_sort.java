package Sorting;

public class Binary_sort {
    static void binary(int arr[]){
        int k=0;
        while(k<5){
            int j =0;
            while(j<arr.length-1){
                if(arr[j]>arr[j+1]){
                for(int i=0;i<arr.length-1;i++){
                    if(arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            }
            else{
                j++;
                
            }
            }
            k++;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,2,3,1,6};
        binary(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
