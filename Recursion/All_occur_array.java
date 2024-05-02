public class All_occur_array {
    static int j=0;
    // static int newarr[]={};
    static void alloccur(int arr[], int key, int i ){
        
        //  if(arr[i]==key){
        //     newarr[i]= i;
        //     alloccur(arr, key, i+1,newarr);
        // }
        if(i==arr.length){
            // for(int j=0;j<=newarr.length-1;j++){
            //     System.out.println(newarr[j]);
            // }
            return ;
        }
        if(arr[i]==key){
            System.out.print (i+" ");
            // newarr[j]= i;    
            // j++;
        }
        alloccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2,};
        int key=2;
        // int i=0;
        //int newarr[]={};
        alloccur(arr, key, 0);
    }
}
