import java.util.*;
import java.util.ArrayList;
import java.security.PublicKey;

public class BSTpart2 {
    // node data info
    static class Node {
        int data;
        Node left;
        Node right;

        // constructor
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // ! L1 sorted array to balanced array
    // public static void preorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // System.out.print(root.data + " ");
    // preorder(root.left);
    // preorder(root.right);
    // }

    // public static void getInorder(Node root, ArrayList<Integer> inorder) {
    // if (root == null) {
    // return;
    // }
    // getInorder(root.left, inorder);
    // inorder.add(root.data);
    // getInorder(root.right, inorder);
    // }

    // // ! L2 Convert BST to balanced BST
    // public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
    // if (st > end) {
    // return null;
    // }

    // int mid = (st + end) / 2;
    // Node root = new Node(inorder.get(mid));
    // root.left = createBST(inorder, st, mid - 1);
    // root.right = createBST(inorder, mid + 1, end);
    // return root;
    // }

    // public static Node balancedBST(Node root) {
    // // step 1. Calculate Inorder seq
    // ArrayList<Integer> inorder = new ArrayList<>();
    // getInorder(root, inorder);

    // // step 2. Sorted inorder -> balanced BST
    // root = createBST(inorder, 0, inorder.size() - 1);
    // return root;
    // }

    // ! L4 size of Largest BST in BT
    // static class Info {
    // boolean isBST;
    // int size;
    // int min;
    // int max;

    // public Info(boolean isBST, int size, int min, int max) {
    // this.isBST = isBST;
    // this.size = size;
    // this.min = min;
    // this.max = max;
    // }
    // }

    // public static int maxBST = 0;

    // public static Info largestBST(Node root) {
    // if (root == null) {
    // return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

    // }

    // Info leftInfo = largestBST(root.left);
    // Info righInfo = largestBST(root.right);
    // int size = leftInfo.size + righInfo.size + 1;
    // int min = Math.min(root.data, Math.min(leftInfo.min, righInfo.min));
    // int max = Math.max(root.data, Math.max(leftInfo.max, righInfo.max));

    // if (root.data <= leftInfo.max || root.data >= righInfo.min) {
    // return new Info(false, size, min, max);
    // }

    // if (leftInfo.isBST && righInfo.isBST) {
    // maxBST = Math.max(maxBST, size);
    // return new Info(true, size, min, max); // ✅ correct
    // }

    // return new Info(false, size, min, max);
    // }

    // ! L5 Size of largest BST in BT (code)
    // Step 1: Get inorder traversal of a BST (which gives sorted elements)
    static void getInorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    // Step 2: Merge two sorted arrays into one
    static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                merged.add(arr1.get(i++));
            } else {
                merged.add(arr2.get(j++));
            }
        }

        while (i < arr1.size())
            merged.add(arr1.get(i++));
        while (j < arr2.size())
            merged.add(arr2.get(j++));

        return merged;
    }

    // Step 3: Convert sorted array to balanced BST
    static Node sortedArrayToBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    // Main function to merge two BSTs
    public static Node mergeBSTs(Node root1, Node root2) {
        // Step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // Step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // Step 3
        ArrayList<Integer> mergedArr = mergeSortedArrays(arr1, arr2);

        // Step 4: Build balanced BST
        return sortedArrayToBST(mergedArr, 0, mergedArr.size() - 1);
    }

    // Optional: Print inorder traversal of BST
    static void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String args[]) {
        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        /* @formatter:off

           8
          / \
        6    10
       /       \
      5         11
     /            \ 
    3              12
        
            @formatter : on
        Given BST
         */
        // Node root = new Node(8);
        // root.left = new Node(6);
        // root.left.left = new Node(5);
        // root.left.left.left = new Node(3);

        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(12);

        /* @formatter:off
           8
          / \
         5   11
        / \  / \
       3   6 10 11
           
       @formatter : on
        EXPECTED BST
         */

         //L1
        // Node root = createBST(arr, 0, arr.length - 1);
        // preorder(root);

        //L2
        // root = balancedBST(root);
        // preorder(root);

        //L3
        // Info info = largestBST(root);
        // System.out.println("Largest BST size = " + maxBST);

         //L5
           // -------- Constructing BST 1 --------
        //        3
        //       / \
        //      1   5
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);

        // -------- Constructing BST 2 --------
        //        4
        //       / \
        //      2   6
        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6);

        // -------- Merging the BSTs --------
        //     3
        //    / \
        //   2   5
        //  /   / \
        // 1   4   6

        Node mergedRoot = mergeBSTs(root1, root2);

        // -------- Printing inorder of merged BST --------
        System.out.println("Inorder of merged BST:");
        printInorder(mergedRoot);  // Output: 1 2 3 4 5 6
    }
}
