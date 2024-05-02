import java.util.ArrayList;

public class multi_list {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<=5;i++){
            list.add(i*2);
        }
        mainlist.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=0;i<=5;i++){
            list2.add(i*3);
            list3.add(i*4);
        }
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
    }
}
