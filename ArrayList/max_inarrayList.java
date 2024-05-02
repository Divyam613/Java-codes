import java.util.ArrayList;
public class max_inarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> max= new ArrayList<>();
        max.add(5);
        max.add(1);
        max.add(3);
        max.add(6);
        max.add(7);
        max.add(4);
        int m =Integer.MIN_VALUE;

        for(int i=0; i<max.size();i++){
            m=Math.max(m, max.get(i));
        }
        System.out.println(m);
    }
}
