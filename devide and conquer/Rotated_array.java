public class Rotated_array {
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2,3};
        int key =0;
        System.out.println(search(arr, key,0,arr.length-1));
    }
    static int search(int arr[],int key,int si, int ei ){
        if(si>ei){
            return -1;

        }
        int mid =si+(ei-si)/2;
        if(key==arr[mid]){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=key&&arr[mid]>=key){
                return search(arr, key,si,mid-1);
            }
            else{
                return search(arr, key, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=key&& key<=arr[ei]){
                return search(arr, key, mid+1, ei);

            }
            else{
                return search(arr, key, si, mid-1);
            }
        }
    }
}
