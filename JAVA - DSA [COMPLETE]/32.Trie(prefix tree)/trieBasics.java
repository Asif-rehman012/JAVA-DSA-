public class trieBasics {
    // static class Node {
    // Node children[] = new Node[26]; // 'a' - 'z'
    // boolean eow = false;

    // // constructor bnaya hai jis mai sarai nodes ko initialize krtai hai null kai
    // // sath
    // public Node() {
    // for (int i = 0; i < 26; i++) {
    // children[i] = null;
    // }
    // }
    // }

    // public static Node root = new Node();

    // // insert operation
    // public static void insert(String word) { // O(L)
    // Node curr = root;
    // for (int level = 0; level < word.length(); level++) {
    // int idx = word.charAt(level) - 'a';
    // if (curr.children[idx] == null) {
    // curr.children[idx] = new Node();

    // }
    // curr = curr.children[idx];
    // }

    // curr.eow = true;
    // }

    // // search operation
    // public static boolean search(String key) {
    // Node curr = root;
    // for (int level = 0; level < key.length(); level++) {
    // int idx = key.charAt(level) - 'a';
    // if (curr.children[idx] == null) {
    // return false;
    // }
    // curr = curr.children[idx];
    // }

    // return curr.eow = true;
    // }

    // public static boolean wordBreak(String key) {
    // if (key.length() == 0) {
    // return true;
    // }
    // for (int i = 1; i <= key.length(); i++) {
    // if (search(key.substring(0, i)) &&
    // wordBreak(key.substring(i))) {
    // return true;
    // }
    // }

    // return false;
    // }

    // ! L7 Prefix problem (shortest unique prefix)
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            prefix.append(word.charAt(i));
            curr = curr.children[idx];
            if (curr.freq == 1) {
                break;
            }
        }

        System.out.println(prefix.toString());
    }

    public static void main(String[] args) {
        // String words[] = { "the", "a", "there", "any", "thee" };
        // for (int i = 0; i < words.length; i++) {
        // insert(words[i]);
        // }
        // // searching of elements
        // System.out.println(search("thee"));
        // System.out.println(search("thor"));
        // System.out.println(search("lk"));

        // L6 word break
        // String arr[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        // for (int i = 0; i < arr.length; i++) {
        // insert(arr[i]);
        // }

        // String key = "ilikesamsung";
        // System.out.println(wordBreak(key));

        // L-07
        String[] arr = { "zebra", "dog", "duck", "dove" };

        // Insert all words into Trie
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        // Find and print shortest unique prefix for each word
        for (int i = 0; i < arr.length; i++) {
            findPrefix(root, arr[i]);
        }
    }
}