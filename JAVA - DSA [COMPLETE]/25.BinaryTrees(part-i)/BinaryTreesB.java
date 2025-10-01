import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // ! build bTree when pre-order sequence is given(O(n))
    // ! Binary Tree construction from preorder Array and Inorder Traversal
    // static class BinaryTree {
    // static int idx = -1;

    // public static Node buildTree(int[] nodes) {
    // idx++;
    // if (idx >= nodes.length)
    // return null; // this is to make sure we never go out of bounds
    // if (nodes[idx] == -1) {
    // return null;
    // }
    // Node newNode = new Node(nodes[idx]);
    // newNode.left = buildTree(nodes);
    // newNode.right = buildTree(nodes);

    // return newNode;
    // }

    // // inorder Traversal
    // public static void inorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // inorder(root.left);
    // System.out.print(root.data + " ");
    // inorder(root.right);
    // }

    // // pre-Order Traversal
    // public static void preorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // System.out.print(root.data + " ");
    // preorder(root.left);
    // preorder(root.right);
    // }

    // // post order traversal
    // public static void postorder(Node root) {

    // if (root == null) {
    // return;
    // }
    // postorder(root.left);
    // postorder(root.right);

    // System.out.print(root.data + " ");
    // }

    // Level Order Traversal
    // public static void levelorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // Queue<Node> q = new LinkedList<>();
    // q.add(root); // root aur null ko add kr diya
    // q.add(null);

    // while (!q.isEmpty()) {
    // Node currNode = q.remove();
    // if (currNode == null) {
    // System.out.println();
    // if (q.isEmpty()) {
    // break;
    // } else {
    // q.add(null);
    // }
    // } else {
    // System.out.print(currNode.data + " "); // agar node null nhi nikli tou data
    // print
    // if (currNode.left != null) {
    // q.add(currNode.left);
    // }
    // if (currNode.right != null) {
    // q.add(currNode.right);
    // }
    // }
    // }
    // }
    // }
    // ! L10 Height of a Tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;

    }

    // ! 11 Count Nodes of a Tree
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // ! L12 sum of all nodes
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    // ! L13 Diameter of a Tree
    public static int diameter(Node root) { // O(N^2)
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        // left aur rt mai max niklai ga fir compare hoga selfDiameter sai
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    public static void main(String[] args) {
        // upto question 9 uncomment below lines
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.inorder(root);
        // tree.preorder(root);
        // tree.postorder(root);
        // tree.levelorder(root);

        // Lec=10
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

        // System.out.println(height(root)); //L10
        // System.out.println(count(root)); // L11 (iss tree mai 7 nodes hai)
        System.out.println(sum(root));
        // System.out.println(diameter(root));

    }
}
