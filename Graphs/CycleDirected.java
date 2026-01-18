import java.util.*;

public class CycleDirected {

    public boolean checkCycleDFS(int node, boolean[] visited, boolean[] dfsVisited,
                                 ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;
        dfsVisited[node] = true;

        for (Integer neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (checkCycleDFS(neighbor, visited, dfsVisited, adj)) {
                    return true;
                }
            } else if (dfsVisited[neighbor]) {
                return true;
            }
        }

        dfsVisited[node] = false;
        return false;
    }

    public boolean detectCycleInDirectedGraph(int n, ArrayList<ArrayList<Integer>> edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
        }

        boolean[] visited = new boolean[n + 1];
        boolean[] dfsVisited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                if (checkCycleDFS(i, visited, dfsVisited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 3;

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(2, 3)));
        edges.add(new ArrayList<>(Arrays.asList(3, 1))); // cycle

        CycleDirected obj = new CycleDirected();
        System.out.println("Cycle Detected: " +
                obj.detectCycleInDirectedGraph(n, edges));
    }
}
