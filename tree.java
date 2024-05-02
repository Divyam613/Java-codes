import java.util.*;

public class tree {
    public static void main(String[] args) {
        String[] arr= {"a","b","c","d","e"};
        String[] arr2={"a","b","d","e"};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(!arr[i].equals(arr2[j])){
                    continue;
                }
                else{
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}



