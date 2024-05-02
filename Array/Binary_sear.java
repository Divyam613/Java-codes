package Array;

import java.util.Scanner;

public class Binary_sear {
    static int binarysearch(int arr[], int key){
        int start = 0;
        int end=arr.length;

        while(start<=end){
            int mid =(start+end)/2;
            //compare with mid value
            if(arr[mid]==key){
                return mid;

            }
            //continue for 2nd part array
            if(arr[mid]<=key){
                start=mid+1;
            }
            //continue with 1st part of array
            else{
                end =mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the target ");
        int tar=sc.nextInt();

        int arr[]= {1,2,4,6,5};
        System.out.println(binarysearch(arr, tar));
        sc.close();
    }
}
