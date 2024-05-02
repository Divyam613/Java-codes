import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(4);

        sort(list);
    }
}
