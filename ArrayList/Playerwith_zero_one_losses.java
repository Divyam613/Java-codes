import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Playerwith_zero_one_losses {
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int[][] list3 = new int[matches.length][2];
        for(int i=0;i<matches.length;i++){
            int[] tlist=matches[i];
            for(int j=0;j<2;j++){
                int f = tlist[j];
                if(j==0){
                    list3[f][j]++;
                }
                else{
                    list3[f][j]++;
                }
            }
        }
        for(int i=0;i<matches.length;i++){
            int[] tlist=list3[i];
            int j=tlist[1];
            if(j==0){
                list.add(j);
            }
            else if(j==1){
                list2.add(j);
            }
        }
        // mainlist.addall(Array.asList(list,list2));
        mainlist.add(list);
        mainlist.add(list2);
        return mainlist;
    }

    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,},{10,9}};
        // ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>(Array.asList(findWinners(matches)));
        System.out.println(findWinners(matches));
    }

}
