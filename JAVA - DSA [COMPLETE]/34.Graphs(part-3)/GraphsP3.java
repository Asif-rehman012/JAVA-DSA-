import java.util.*;

public class GraphsP3 {

    //! L2 Topological sort using BFS

    // Edge class to represent a directed edge
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // // Function to create the graph
    // static void createGraph(ArrayList<Edge>[] graph) {
    //     for (int i = 0; i < graph.length; i++) {
    //         graph[i] = new ArrayList<>();
    //     }

    //     // Directed edges
    //     graph[0].add(new Edge(0, 3));
    //     graph[2].add(new Edge(2, 3));
    //     graph[3].add(new Edge(3, 1));
    //     graph[4].add(new Edge(4, 0));
    //     graph[4].add(new Edge(4, 1));
    //     graph[5].add(new Edge(5, 0));
    //     graph[5].add(new Edge(5, 2));
    // }


    //! L3- All paths from source to target(directed graph)-- only this function for Q3
    // public static void printAllpath(ArrayList<Edge> graph[], int src, int dest, String path){
    //     if (src == dest) {
    //         System.out.println(path+dest);
    //         return;
    //     }

    //     for(int i=0; i<graph[src].size(); i++){
    //         Edge e = graph[src].get(i);
    //         printAllpath(graph, e.dest, dest, path+src);
    //     }
    // }
    // // Function to calculate in-degrees of all vertices
    // public static void calcIndeg(ArrayList<Edge>[] graph, int[] indeg) {
    //     for (int i = 0; i < graph.length; i++) {
    //         for (int j = 0; j < graph[i].size(); j++) {
    //             Edge e = graph[i].get(j);
    //             indeg[e.dest]++;
    //         }
    //     }
    // }

    // // Function to perform topological sort using BFS (Kahn’s Algorithm)
    // public static void topSort(ArrayList<Edge>[] graph) {
    //     int[] indeg = new int[graph.length];
    //     calcIndeg(graph, indeg); // compute in-degrees first

    //     Queue<Integer> q = new LinkedList<>();

    //     // Add all vertices with 0 in-degree to queue
    //     for (int i = 0; i < indeg.length; i++) {
    //         if (indeg[i] == 0) {
    //             q.add(i);
    //         }
    //     }

    //     System.out.print("Topological Sort (Kahn’s Algorithm): ");

    //     // BFS
    //     while (!q.isEmpty()) {
    //         int curr = q.remove();
    //         System.out.print(curr + " "); // print the vertex

    //         for (int i = 0; i < graph[curr].size(); i++) {
    //             Edge e = graph[curr].get(i);
    //             indeg[e.dest]--;
    //             if (indeg[e.dest] == 0) {
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    //     System.out.println();
    // }

    //! Dijistraks algo

  // Function to create the graph
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges (keeping your exact values)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class pair implements Comparable<pair> {
        int n;
        int path;

        public pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(pair p2) {
            return this.path - p2.path; // smaller distance = higher priority
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int dist[] = new int[graph.length]; // dist -> src to i
        boolean vis[] = new boolean[graph.length];

        // initialize distances
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // infinity
            }
        }

        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src, 0));
        dist[src] = 0;

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;

                // explore neighbors
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }

        // print all shortest distances from source
        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Node " + i + " : " + dist[i]);
        }
    }

    // Main function
    public static void main(String[] args) {
        int V = 6; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // topSort(graph);

        // int src=5, dest = 1;
        // printAllpath(graph, src, dest, "");

        // dijisktra algo
        int src = 0;
        dijkstra(graph, src);

    }
}
