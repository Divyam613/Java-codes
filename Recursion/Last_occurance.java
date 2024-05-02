public class Last_occurance {
    static int first_occur(int arr[],int key, int i){
        
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        
        return first_occur(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,7,3,6,7,5,4,3,6,8,9};
        int key = 5;
        int i=arr.length-1;
        System.out.println("key is at"+first_occur(arr,key,i));
    }
}
