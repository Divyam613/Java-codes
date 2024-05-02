package Array;

public class Reverse {
    public static void reverse(int arr[]){
        int start = 0;
        int end= arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        

    }

    public static void main(String[] args) {
        int arr[]= {1,6,5,8,9};
        reverse(arr);
        System.out.print("reversed array is : {");
        for(int i=0; i<=arr.length-1;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("}");
        
    }
}
