import java.util.ArrayList;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<=5;i++){
            arr.add(i*2);
        }
        reverse(arr);

    }
    public static void reverse(ArrayList<Integer>arr){
        arr.reversed();
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
