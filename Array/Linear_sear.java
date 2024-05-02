package Array;
import java.util.*;

public class Linear_sear {
    public static int linearsearch(int arr[], int target){
        for(int i=0; i<=arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the target ");
        int tar=sc.nextInt();

        int arr[]= {1,2,4,6,5};
        int r =linearsearch(arr, tar);;

        if(r==-1){
            System.out.println("value not found");

        }
        else{
            System.out.println("index of the value is:"+r);
        }
        sc.close();
    }
}
