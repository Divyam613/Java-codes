import java.util.ArrayList;

public class Container_with_most_water {
    // public static int contain(ArrayList<Integer> list){
    //     int max = 0;

    //     for(int i =0;i<list.size();i++){
    //         for(int j =i; j<list.size();j++){
    //             int height = Math.min(list.get(i), list.get(j));
    //             int width=j-i;
    //             int temp=height*width;
    //             max = Math.max(max, temp);
    //         }
    //     }
    //     return max;
    // }

    //OPTIMISED WAY
    static int contain_optimise(ArrayList<Integer> list){
        int max = 0;
        int i =0;
        int j=list.size()-1;
        while(i!=j){
            int height = Math.min(list.get(i), list.get(j));
                int width=j-i;
                int temp=height*width;
                max = Math.max(max, temp);
            if(list.get(i)<list.get(j)){                
                i++;
            }
            else{

                j--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        //System.out.println(contain(list));
        System.out.println(contain_optimise(list));
    }
}  