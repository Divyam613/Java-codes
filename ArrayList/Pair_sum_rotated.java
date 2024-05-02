import java.util.ArrayList;

public class Pair_sum_rotated {
    static boolean pair(ArrayList<Integer> list, int sum) {
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int i = bp+1;
        int j = bp;
        while (i != j) {
            if (list.get(i) + list.get(j) == sum) {
                return true;
            } else if (list.get(i) + list.get(j) < sum) {
                i=((i+1)%list.size());

            } else {
                
                j=(list.size()+j-1)%list.size();
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        int sum = 11;
        System.out.println(pair(list, sum));
    }
}
