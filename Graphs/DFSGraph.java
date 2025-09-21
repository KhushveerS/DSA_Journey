import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFSGraph {
    public static ArrayList<Integer> dfsfgraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // boolean array to keep the track of visisted vertices
        boolean vis[]=new boolean[V];
        vis[0]=true;
        ArrayList<Integer> list =new ArrayList<>();
        dfs(0,vis,adj,list);
        return list;
    }
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>list)
    {   //marking the current node as visited
        vis[node]=true;
        list.add(node);
        //getting the neighbouring node
        for(Integer it:adj.get(node))
        {
            if(vis[it]==false)
            {
                dfs(it,vis,adj,list);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5; // number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Example graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        System.out.println(dfsfgraph(V, adj));
    }
}

