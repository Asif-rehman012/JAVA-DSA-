public class segTrees {

    //! lec-03 Creation of ST(segment tree)
    // static int tree[];

    // public static void init(int n){
    //     tree = new int [4*n];
    // }

    // public static int buildST(int arr[], int i, int start, int end){
    //     if (start == end) {
    //         tree[i] = arr[start];
    //         return arr[start];
    //     }

    //     int mid = (start+end)/2;
    //     buildST(arr, 2*i+1, start, mid); // left subtree -2*i+1
    //     buildST(arr, 2*i+2, mid+1, end); //right subtree -2*i+2
    //     tree[i] = tree[2*i+1] + tree[2*i+2];
    //     return tree[i];

    // }

       //! lec-04 Queries on ST (segment tree)
//       public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
//     // Case 1: No overlap
//     if (qj < si || qi > sj) {
//         return 0;
//     }

//     // Case 2: Complete overlap
//     if (qi <= si && qj >= sj) {
//         return tree[i];
//     }

//     // Case 3: Partial overlap
//     int mid = (si + sj) / 2;
//     int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
//     int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);

//     return left + right;
// }

// public static int getSum(int arr[], int qi, int qj) {
//     int n = arr.length;
//     return getSumUtil(0, 0, n - 1, qi, qj);
// }

   //! lec 05 (Update on ST)

    // // Update Utility — updates all nodes affected by arr[idx] change
    // public static void updateUtil(int i, int si, int sj, int idx, int diff) {
    //     // Base case: if idx is outside current segment range
    //     if (idx < si || idx > sj) return;

    //     // Update current node
    //     tree[i] += diff;

    //     // If not leaf, update children
    //     if (si != sj) {
    //         int mid = (si + sj) / 2;
    //         updateUtil(2 * i + 1, si, mid, idx, diff);
    //         updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
    //     }
    // }

    // // Update wrapper function
    // public static void update(int arr[], int idx, int newVal) {
    //     int n = arr.length;
    //     int diff = newVal - arr[idx]; // find difference
    //     arr[idx] = newVal;            // update original array
    //     updateUtil(0, 0, n - 1, idx, diff);
    // }

    //! lec-06 Max_Min segment Tree (Creation-code)
        static int tree[];

    // Step 1: Initialize tree
    public static void init(int n) {
        tree = new int[4 * n];
    }

    // Step 2: Build the tree for maximum values
    public static void buildTree(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si + sj) / 2;
        buildTree(2 * i + 1, si, mid, arr);       // Left child
        buildTree(2 * i + 2, mid + 1, sj, arr);   // Right child

        // Internal node stores max of both children
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    // Step 3: Query - get maximum in range [qi, qj]
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        // No overlap
        if (qj < si || qi > sj) {
            return Integer.MIN_VALUE;
        }

        // Complete overlap
        if (qi <= si && qj >= sj) {
            return tree[i];
        }

        // Partial overlap
        int mid = (si + sj) / 2;
        int left = getMaxUtil(2 * i + 1, si, mid, qi, qj);
        int right = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);

        return Math.max(left, right);
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    // Step 4: Update a value in the array and tree
    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        // Base case: if idx is outside range
        if (idx < si || idx > sj) return;

        // If leaf node, update the value
        if (si == sj) {
            tree[i] = newVal;
            return;
        }

        int mid = (si + sj) / 2;
        updateUtil(2 * i + 1, si, mid, idx, newVal);      // Update left child
        updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);  // Update right child

        // Update current node with new max
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        updateUtil(0, 0, arr.length - 1, idx, newVal);
    }
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // int n = arr.length;
        // init(n);
        // buildST(arr, 0, 0, n-1);

        //lec 3
        // for(int i=0; i<tree.length; i++){
        //      System.out.print(tree[i]+ " ");
        // }

        //lec 4
        // System.out.println(getSum(arr, 2, 5));

        //lec 5
        // System.out.println(getSum(arr, 2, 5));
        // update(arr, 2, 2);
        // System.out.println(getSum(arr, 2, 5));

        //lec 6
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildTree(0, 0, n-1, arr);

        // for(int i=0; i<tree.length; i++){
        //     System.out.print(tree[i]+ " ");
        // }

        int max = getMax(arr, 2, 5);
        System.out.println(max); //-1

        update(arr, 2, 20);

         System.out.println("Max in range (1, 4): " + getMax(arr, 1, 4)); // Expected: 8
        update(arr, 3, 10); // arr[3] = 10
        System.out.println("After update, max in range (1, 4): " + getMax(arr, 1, 4)); // Expected: 10
    }
}
