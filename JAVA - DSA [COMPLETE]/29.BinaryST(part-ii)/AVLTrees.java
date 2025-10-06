public class AVLTrees {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1; // New node is initially added at leaf
        }
    }

    public static Node root;

    // Get height of node
    public static int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // Get maximum of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get Balance factor of node
    public static int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    // Insert a node into the AVL tree and return the new root
    public static Node insert(Node node, int key) {
        // 1. Perform normal BST insertion
        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        // 2. Update height of this ancestor node
        node.height = 1 + max(height(node.left), height(node.right));

        // 3. Get the balance factor
        int balance = getBalance(node);

        // 4. Balance the tree if needed

        // Left Left Case
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the unchanged node pointer
        return node;
    }

    // Preorder traversal (Root, Left, Right)
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Main method to test the AVL Tree
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
         * Final AVL Tree:
         * 30
         * / \
         * 20 40
         * / \ \
         * 10 25 50
         */

        System.out.println("Preorder traversal of AVL Tree:");
        preorder(root); // Output: 30 20 10 25 40 50
    }
}
