import java.util.*;

public class Graphp6 {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Creating a sample graph
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    // Step 1 DFS (Topological sort)
    public static void topsort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topsort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    // Step 3 DFS on Transposed Graph
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) { //T.C= O(V+E)

        // Step 1 → Topological Order (store in stack)
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topsort(graph, i, vis, s);
            }
        }

        // Step 2 → Transpose Graph
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse edge
            }
        }

        // Step 3 → DFS using stack order on transpose graph
        Arrays.fill(vis, false);

        System.out.println("Strongly Connected Components:");
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        kosaraju(graph, V);
    }
}


/////////////////////////////////////////////////////////////////////////////

/! lec-02 

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
     
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));
    graph[3].add(new Edge(3, 5));

    graph[4].add(new Edge(4, 3));
    graph[4].add(new Edge(4, 5));

    graph[5].add(new Edge(5, 3));
    graph[5].add(new Edge(5, 4));
    }


    //! lec-03 code Articulation point (Tarjan's algorithm)

      // DFS for articulation points
    public static void dfs(ArrayList<Edge> graph[], int curr, int par,
                           int dt[], int low[], int time, boolean vis[], boolean ap[]) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        int children = 0;

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            if (neigh == par) continue;

            if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, time, vis, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                children++;

                // Articulation point condition (not root)
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }
            } else {
                // Update low using back-edge
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }

        // Root AP condition
        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, time, vis, ap);
            }
        }

        // Print APs
        System.out.print("Articulation Points: ");
        for (int i = 0; i < V; i++) {
            if (ap[i]) System.out.print(i + " ");
        }
        System.out.println();
    }

    //! lec-02 code Bridge in Graph (Tarjan_s Algorithm)

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i); //e.src ---  e.dest
            int neigh = e.dest;
            if (neigh == par) {
                continue;
            }else if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, vis, time);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (dt[curr] < low[neigh]) {
                    System.out.println("Bridge Nodes/points are as : " + curr + " ---- " + neigh);
                }
            }else{
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void tarjanBridge(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];


        for(int i=0; i<V; i++){
             if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
             }
        }
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);

           getAP(graph, V);
    }}

