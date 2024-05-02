package Binary_tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Check_if_a_given_graph_is_tree_or_not {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++)
        {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        if(dfs(0,-1,adj,visited))
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int node,int parent,ArrayList<ArrayList<Integer>> adj,boolean[] visited)
    {
        visited[node] = true;
        for(int it:adj.get(node))
        {
            if(!visited[it])
            {
                if(dfs(it,node,adj,visited))
                {
                    return true;
                }
            }
            else if(it!=parent)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=5;
        int m=5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        edges.add(new ArrayList<Integer>(Arrays.asList(0,1)));
        edges.add(new ArrayList<Integer>(Arrays.asList(0,2)));
        edges.add(new ArrayList<Integer>(Arrays.asList(0,3)));
        edges.add(new ArrayList<Integer>(Arrays.asList(1,4)));
        edges.add(new ArrayList<Integer>(Arrays.asList(2,3)));
        System.out.println(isTree(n,m,edges));
    }
}
