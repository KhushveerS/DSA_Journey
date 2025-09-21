import java.util.*;
public class NumberOfProvinces {
    public static void main(String[] args) {


    }
    public static int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int V=isConnected.length;
        adj=convert(isConnected,V);

        // boolean array to keep the track of visisted vertices
            boolean vis[] = new boolean[V];
            ArrayList<Integer> list = new ArrayList<>();
            int count=0;
            for (int i = 0; i < V; i++) {
                if (!vis[i]) {
                    count++;
                    dfs(i, vis, adj, list);
                }
            }
            return count;
        }

        public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list){
            vis[node] = true;
            list.add(node);

            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    dfs(it, vis, adj, list);
                }
            }
        }

    // Function to convert adj matrix into adj list
    public static ArrayList<ArrayList<Integer>> convert(int[][] adjMatrix, int V) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // create empty list for each vertex
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // fill adjacency list from matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adjMatrix[i][j] == 1) { // edge exists
                    adjList.get(i).add(j);
                }
            }
        }
        return adjList;
    }
}
