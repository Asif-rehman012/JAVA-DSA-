import java.util.*;

class BinaryTAdv {
    // Node structure
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // ! L-01 Recursive function to print all nodes at Kth level
    // public static void printKthLevel(Node root, int k) {
    // if (root == null)
    // return;

    // // Base case: when we reach the Kth level
    // if (k == 1) {
    // System.out.print(root.data + " ");
    // return;
    // }

    // // Recurse on left and right subtrees with reduced k
    // printKthLevel(root.left, k - 1);
    // printKthLevel(root.right, k - 1);
    // }

    // ! L-02 Lowest common Ancestor(APPROACH 1) O(N) ->3(n)
    // Function to get the path from root node to the given node n
    // public static boolean getPath(Node root, int n, ArrayList<Node> path) {
    // if (root == null) {
    // return false;
    // }

    // // Add current node to the path
    // path.add(root);

    // // If current node is the target node, return true
    // if (root.data == n) {
    // return true;
    // }

    // // Recursively check in left and right subtrees
    // boolean foundLeft = getPath(root.left, n, path);
    // boolean foundRight = getPath(root.right, n, path);

    // // If node is found in either subtree, return true
    // if (foundLeft || foundRight) {
    // return true;
    // }

    // // If not found, remove the current node (backtrack) and return false
    // path.remove(path.size() - 1);
    // return false;
    // }

    // // Function to find the lowest common ancestor (LCA) of two nodes
    // public static Node lca(Node root, int n1, int n2) {
    // // sb sai phalai path find kr loo ARRAYLIST PATH 1 INterger bna loo
    // ArrayList<Node> path1 = new ArrayList<>();
    // ArrayList<Node> path2 = new ArrayList<>();

    // // Get paths from root to n1 and n2
    // getPath(root, n1, path1);
    // getPath(root, n2, path2); // ✅ Fixed: used n2 instead of n1 again

    // // Find the last common node in both paths
    // int i = 0;
    // for (; i < path1.size() && i < path2.size(); i++) {
    // if (path1.get(i) != path2.get(i)) {
    // break;
    // }
    // }

    // // last equal node -> i-1th index is the LCA
    // Node lca = path1.get(i - 1);
    // return lca;
    // }

    // ! L3 Approach 2 of above problem
    // public static class Solution {
    // public static Node lca(Node root, int n1, int n2) {
    // if (root == null) {
    // return null;
    // }

    // // If current node matches either n1 or n2, return it
    // if (root.data == n1 || root.data == n2) {
    // return root;
    // }

    // // Recur for left and right subtrees
    // Node leftLCA = lca(root.left, n1, n2);
    // Node rightLCA = lca(root.right, n1, n2);

    // // If both calls returned non-null, current node is LCA
    // if (leftLCA != null && rightLCA != null) {
    // return root;
    // }

    // // Otherwise return the non-null child

    // return (leftLCA != null) ? leftLCA : rightLCA;
    // }

    // ! L4 Min distance between 2 Nodes

    // Function to find the Lowest Common Ancestor (LCA)
    // public static Node lca(Node root, int n1, int n2) {
    // if (root == null)
    // return null;

    // if (root.data == n1 || root.data == n2)
    // return root;

    // Node left = lca(root.left, n1, n2);
    // Node right = lca(root.right, n1, n2);

    // if (left != null && right != null)
    // return root;

    // return (left != null) ? left : right;
    // }

    // // Function to find the distance from a given node to target node n
    // public static int lcaDist(Node root, int n) {
    // if (root == null)
    // return -1;

    // if (root.data == n)
    // return 0;

    // int leftDist = lcaDist(root.left, n);
    // int rightDist = lcaDist(root.right, n);

    // if (leftDist == -1 && rightDist == -1)
    // return -1;

    // return (leftDist != -1) ? leftDist + 1 : rightDist + 1;
    // }

    // // Function to find the minimum distance between two nodes in a binary tree
    // public static int minDist(Node root, int n1, int n2) {
    // Node lcaNode = lca(root, n1, n2);
    // if (lcaNode == null) {
    // System.out.println("LCA not found. One or both nodes not present in the
    // tree.");
    // return -1;
    // }

    // int dist1 = lcaDist(lcaNode, n1);
    // int dist2 = lcaDist(lcaNode, n2);

    // if (dist1 == -1 || dist2 == -1) {
    // System.out.println("One or both nodes not found in the tree.");
    // return -1;
    // }

    // return dist1 + dist2;
    // }

    // ! L5.... Kth Ancestor of Node
    // public static int KAncestor(Node root, int n, int k) {
    // if (root == null) {
    // return -1;
    // }
    // if (root.data == n) {
    // return 0;
    // }

    // int leftDist = KAncestor(root.left, n, k);
    // int rightDist = KAncestor(root.right, n, k);

    // if (leftDist == -1 && rightDist == -1) {
    // return -1;
    // }
    // int max = Math.max(leftDist, rightDist);
    // if (max + 1 == k) {
    // System.out.println(root.data);
    // }
    // return max + 1;
    // }
    // ! Lec 6... Transform to Sum Tree
    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Driver code
    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Lec 1
        // int k = 3;
        // System.out.print("Nodes at level " + k + ": ");
        // printKthLevel(root, k); // Output: 4 5 6 7

        // Lec 2
        // int n1 = 4, n2 = 5;
        // System.out.println(lca(root, n1, n2).data);

        // L3 approach 2 lca
        // Node lcaNode = Solution.lca(root, 5, 1); // Should return node with data 3
        // System.out.println("LCA: " + (lcaNode != null ? lcaNode.data : "Not found"));

        // L4
        // int n1 = 4, n2 = 6;
        // int distance = minDist(root, n1, n2);
        // if (distance != -1) {
        // System.out.println("Min Distance between " + n1 + " and " + n2 + " is: " +
        // distance);

        // L5
        // int n = 5, k = 2;
        // KAncestor(root, n, k);

        // L6
        transform(root);
        preorder(root);
    }
}
