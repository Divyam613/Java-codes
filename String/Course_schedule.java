import java.util.ArrayList;
public class Course_schedule {
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        int[] res = new int[n];
        int[] indegree = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (ArrayList<Integer> edge : prerequisites) {
            adj.get(edge.get(1)).add(edge.get(0));
            indegree[edge.get(0)]++;
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                res[index++] = i;
            }
        }
        for (int i = 0; i < index; i++) {
            for (int j : adj.get(res[i])) {
                indegree[j]--;
                if (indegree[j] == 0) {
                    res[index++] = j;
                }
            }
        }
        if (index != n) {
            return new int[0];
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 4, m = 4;
        ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(0);
        prerequisites.add(temp);
        temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(0);
        prerequisites.add(temp);
        temp = new ArrayList<Integer>();
        temp.add(3);
        temp.add(1);
        prerequisites.add(temp);
        temp = new ArrayList<Integer>();
        temp.add(3);
        temp.add(2);
        prerequisites.add(temp);
        int[] res = findOrder(n, m, prerequisites);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
