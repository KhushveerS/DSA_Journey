import java.util.*;
public class BFSGraph {
    public static void main(String[] args) {

            int V = 5; // number of vertices
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            // Initialize adjacency list
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            // Add edges (undirected)
            adj.get(0).add(1);
            adj.get(0).add(2);
            adj.get(1).add(0);
            adj.get(1).add(3);
            adj.get(2).add(0);
            adj.get(2).add(4);
            adj.get(3).add(1);
            adj.get(4).add(2);


            System.out.println(bfs(V, adj));


    }
    public static ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>> adj ){
        ArrayList<Integer> list=new ArrayList<>();
        boolean vistied[]=new boolean[V];
        Queue<Integer> queue =new LinkedList<>();

        queue.add(0);
        vistied[0]=true;
        while(!queue.isEmpty())
        {
            Integer node=queue.poll();
            list.add(node);

            for(Integer it:adj.get(node)){
                if(vistied[it]== false)
                {
                    vistied[it]=true;
                    queue.add(it);
                }
            }
        }
        return list;
    }
}
