import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeii {
    // Node structure
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // ! L2 Optimized diameter of a Tree
    // Info class to store both diameter and height
    // static class Info {
    // int diam; // diameter of subtree
    // int ht; // height of subtree

    // Info(int diam, int ht) {
    // this.diam = diam;
    // this.ht = ht;
    // }
    // }

    // // Optimized diameter function (O(N))
    // public static Info diameter(Node root) {
    // if (root == null) {
    // return new Info(0, 0);
    // }

    // Info leftInfo = diameter(root.left);
    // Info rightInfo = diameter(root.right);

    // int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),
    // leftInfo.ht + rightInfo.ht + 1);

    // int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

    // return new Info(diam, ht);
    // }

    // ! L4 Is-subtree of another node identical or not
    // public static boolean isIdentical(Node node, Node subRoot) {
    // if (node == null && subRoot == null) {
    // return true; // agar dono bottom nodes null hogayai tou true
    // } else if (node == null || subRoot == null || node.data != subRoot.data) {
    // return false;// dono mai aak null hota ya data unequal hota tou false
    // }
    // // agar left nai false diya tou non-identical
    // if (!isIdentical(node.left, subRoot.left)) {
    // return false;
    // }
    // // rt nai non-identical diya
    // if (!isIdentical(node.right, subRoot.right)) {
    // return false;
    // }
    // return true;
    // }

    // public static boolean isSubtree(Node root, Node subRoot) {
    // if (root == null) {
    // return false;
    // }
    // if (root.data == subRoot.data) {
    // if (isIdentical(root, subRoot)) {
    // return true;
    // }
    // }
    // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    // ! L5/L6/L7 Top view of a tree CODE
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) { // first time my hd is occurring
                    map.put(curr.hd, curr.node);

                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1); // ✅ correct
                }

            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        // Build a sample tree
        /*
         * 
         * 1
         * / \
         * 2 3
         * / \
         * 4 5
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         * 2
         * / \
         * 4 5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // Call diameter
        // Info result = diameter(root);

        // System.out.println("Height of tree: " + result.ht);
        // System.out.println("Diameter of tree: " + result.diam);

        // System.out.println(isSubtree(root, subRoot));
        topView(root);
    }
}