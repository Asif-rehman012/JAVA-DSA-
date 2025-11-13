import java.util.*; 

public class Graphsp5 {
//     //! Lec1:  CHEAPEST FLIGHTS WITHIN K Stops (leetcode 787 using Queue)
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int wt) {
//             this.src = s;
//             this.dest = d;
//             this.wt = wt;
//         }
//     }
//     public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

        
//         for (int i = 0; i < flights.length; i++) {
//             int src = flights[i][0];
//             int dest = flights[i][1];
//             int wt = flights[i][2];

//             graph[src].add(new Edge(src, dest, wt));
//         }
//     }

//     static class Info {
//         int v;
//         int cost;
//         int stops;

//         public Info(int v, int c, int s) {
//             this.v = v;
//             this.cost = c;
//             this.stops = s;
//         }
//     }

//     public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {

//         ArrayList<Edge> graph[] = new ArrayList[n];
//         createGraph(flights, graph);

//         int dist[] = new int[n];
//         Arrays.fill(dist, Integer.MAX_VALUE);
//         dist[src] = 0;

        
//         Queue<Info> q = new LinkedList<>();
//         q.add(new Info(src, 0, 0));

//         while (!q.isEmpty()) {
//             Info curr = q.remove();

//             if (curr.stops > k)
//                 continue;

//             for (int i = 0; i < graph[curr.v].size(); i++) {
//                 Edge e = graph[curr.v].get(i);

//                 int u = e.src;
//                 int v = e.dest;
//                 int wt = e.wt;

//                 if (curr.cost + wt < dist[v] && curr.stops <= k) {
//                     dist[v] = curr.cost + wt;
//                     q.add(new Info(v, dist[v], curr.stops + 1));
//                 }
//             }
//         }

//         return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         int flights[][] = {
//             {0, 1, 100},
//             {1, 2, 100},
//             {2, 0, 100},
//             {1, 3, 600},
//             {2, 3, 200}
//         };
//         int src = 0, dst = 3, k = 1;

//         int ans = cheapestFlight(n, flights, src, dst, k);
//         System.out.println("Cheapest Price: " + ans);
//     }
// }

//! lec-03 CONNECTING CITIES(code)
//     static class Edge implements Comparable<Edge> {  
//         int dest;
//         int cost;

//         public Edge(int d, int c) {
//             this.dest = d;
//             this.cost = c;
//         }

//         @Override
//         public int compareTo(Edge e2) {
//             return this.cost - e2.cost; // ascending order
//         }
//     }

//     public static int connectCities(int cities[][]) {
        
//         PriorityQueue<Edge> pq = new PriorityQueue<>();
//         boolean vis[] = new boolean[cities.length];

//         pq.add(new Edge(0, 0)); // start from city 0
//         int finalCost = 0;

//         while (!pq.isEmpty()) {
//             Edge curr = pq.remove();

//             if (!vis[curr.dest]) {
//                 vis[curr.dest] = true;
//                 finalCost += curr.cost;

//                 // Add all edges from current city to PQ
//                 for (int i = 0; i < cities[curr.dest].length; i++) {
//                     if (cities[curr.dest][i] != 0 && !vis[i]) {
//                         pq.add(new Edge(i, cities[curr.dest][i]));
//                     }
//                 }
//             }
//         }

//         return finalCost;
//     }

//     public static void main(String[] args) {
//         int cities[][] = {
//             {0, 1, 2, 3, 4},
//             {1, 0, 5, 0, 7},
//             {2, 5, 0, 6, 0},
//             {3, 0, 6, 0, 0},
//             {4, 7, 0, 0, 0}
//         };

//         System.out.println("Minimum cost to connect all cities: " + connectCities(cities));
//     }
// }


//! Lec-05 Disjoint set Union
// static int n = 7;
// static int par[] = new int[n];
// static int rank[] = new int[n];

// public static void init(){
//   for(int i=0; i<n; i++){
//       par[i] = i;
//   }
// }

// public static int find(int x){
//      if (x == par[x]) {
//          return x;
//      }

//     return par[x] = find(par[x]);
// }

// public static void union (int a, int b){
//        int parA = find(a);
//        int parB = find(b);

//   if (rank[parA] == rank[parB]) {
//       par[parB] = parA;
//       rank[parA]++;
//   }
//   else if (rank[parA] < rank[parB]) {
//     par[parA] = parB;

//   }else{
//     par[parB] = parA;
//   }
// }

// public static void main(String[] args) {
//     init();
//     union(1,3);
//     System.out.println(find(3));
//     union(2, 4);
//     union(3, 6);
//     union(1, 4);

//     System.out.println(find(3));
//     System.out.println(find(4));
//     union(1, 5);
// }}


//! lec-06  Kruskal's Algorithm 

//  static class Edge implements Comparable<Edge> {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w; 
//         }

//         @Override
//         public int compareTo(Edge e2) {
//             return this.wt - e2.wt; // ascending order by weight
//         }
//     }

//     // Create a list of edges
//     static void createGraph(ArrayList<Edge> edges) {
//         edges.add(new Edge(0, 1, 10));
//         edges.add(new Edge(0, 2, 15));
//         edges.add(new Edge(0, 3, 30));
//         edges.add(new Edge(1, 3, 40));
//         edges.add(new Edge(2, 3, 50));
//     }

//     static int n = 4;
//     static int par[] = new int[n];
//     static int rank[] = new int[n];

//     // Initialize parent and rank arrays
//     public static void init() {
//         for (int i = 0; i < n; i++) {
//             par[i] = i;
//             rank[i] = 0;
//         }
//     }

//     // Find function with path compression
//     public static int find(int x) {
//         if (x == par[x]) {
//             return x;
//         }
//         return par[x] = find(par[x]);
//     }

//     // Union by rank
//     public static void union(int a, int b) {
//         int parA = find(a);
//         int parB = find(b);

//         if (parA == parB) return; // already in same set

//         if (rank[parA] == rank[parB]) {
//             par[parB] = parA;
//             rank[parA]++;
//         } else if (rank[parA] < rank[parB]) {
//             par[parA] = parB;
//         } else {
//             par[parB] = parA;
//         }
//     }

//     //  Kruskal's Algorithm
//     public static void kruskalsMST(ArrayList<Edge> edges, int V) {
//         Collections.sort(edges); // sort edges by weight
//         init();

//         int mstCost = 0;
//         int count = 0;

//         for (int i = 0; count < V - 1 && i < edges.size(); i++) {
//             Edge e = edges.get(i);

//             int parA = find(e.src);
//             int parB = find(e.dest);

//             // Include edge only if it doesn't form a cycle
//             if (parA != parB) {
//                 union(e.src, e.dest);
//                 mstCost += e.wt;
//                 count++;
//                 System.out.println("Edge " + e.src + " - " + e.dest + " added (weight " + e.wt + ")");
//             }
//         }

//         System.out.println("Minimum Cost of MST: " + mstCost);
//     }

//     public static void main(String[] args) {
//         int V = 4;
//         ArrayList<Edge> edges = new ArrayList<>();
//         createGraph(edges);

//         kruskalsMST(edges, V);
//     }
// }

//! lec-07  Flood Fill Algorithm (leetcode 733 easy)
 public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length
                || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        helper(image, sr, sc - 1, color, vis, orgCol); // left
        helper(image, sr, sc + 1, color, vis, orgCol); // right
        helper(image, sr - 1, sc, color, vis, orgCol); // up
        helper(image, sr + 1, sc, color, vis, orgCol); // down
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        int orgCol = image[sr][sc];

        if (orgCol != color) {
            helper(image, sr, sc, color, vis, orgCol);
        }
        return image;
    }

    public static void main(String[] args) {
        Graphsp5 obj = new Graphsp5(); // ✅ now matches the filename

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1, sc = 1, color = 2;
        int[][] result = obj.floodFill(image, sr, sc, color);

        System.out.println("Flood Filled Image after Changing 1 old color to New 2:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}