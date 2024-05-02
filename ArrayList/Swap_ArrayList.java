import java.util.ArrayList;

public class Swap_ArrayList {
    static void Swap(ArrayList<Integer>list, int a,int b){
        int temp=list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
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

        int a=list.indexOf(3);
        int b=list.indexOf(7);
        Swap(list, a, b);
    }
    
}
