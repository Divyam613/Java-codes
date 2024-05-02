package Array;

public class Pairs_in_array {
    static void Pair(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int num = arr[i];
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("(" + num+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]= {4,5,6,9,2};
        Pair(arr);
    }
}
