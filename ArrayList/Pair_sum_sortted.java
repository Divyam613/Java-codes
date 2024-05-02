import java.util.ArrayList;

public class Pair_sum_sortted {
    //Brute force


    // static boolean pair(ArrayList<Integer> list,int sum){
    //     //Brute force
    //     for(int i = 0;i<list.size();i++){
    //         for(int j =0;j<list.size();j++){
    //             if(list.get(i)==list.get(j)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //Optimised form
    static boolean pair(ArrayList<Integer> list, int sum){
        int i=0;
        int j=list.size()-1;
        while(i!=j){
        if(list.get(i)+list.get(j)==sum){
            return true;
        }
        else if(list.get(i)+list.get(j)<sum){                
            i++;
        }
        else{

            j--;
        }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int sum =10;
        System.out.println(pair(list, sum));        
    }
}
