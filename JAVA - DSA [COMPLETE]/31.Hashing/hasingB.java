import java.util.*;

public class hasingB {
    // ! Lecture 6 ()
    // static class HashMap<K, V> {

    // // Node represents a key-value pair (entry) in the HashMap
    // private class Node {
    // K key;
    // V value;

    // public Node(K key, V value) {
    // this.key = key;
    // this.value = value;
    // }
    // }

    // private int size; // Total number of key-value pairs
    // private int N;
    // private LinkedList<Node>[] buckets; // Array of buckets, each bucket is a
    // LinkedList

    // // Constructor: initializes the HashMap with 4 buckets
    // @SuppressWarnings("unchecked")
    // public HashMap() {
    // this.size = 0;
    // this.N = 4;
    // this.buckets = new LinkedList[4]; // Initial capacity = 4 buckets
    // for (int i = 0; i < buckets.length; i++) {
    // this.buckets[i] = new LinkedList<>();
    // }
    // }

    // // Hash function: converts a key into a valid bucket index
    // private int hashFunction(K key) {
    // int hc = key.hashCode();
    // return Math.abs(hc) % N;
    // }

    // // Searches for the index of a key in a bucket
    // // Returns index if found, otherwise -1
    // private int searchInBucket(int bi, K key) {
    // LinkedList<Node> bucket = buckets[bi];
    // for (int i = 0; i < bucket.size(); i++) {
    // if (bucket.get(i).key.equals(key)) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // private void rehash() {
    // LinkedList<Node> oldBuck[] = buckets;
    // buckets = new LinkedList[buckets.length * 2];
    // N = 2 * N;
    // for (int i = 0; i < buckets.length; i++) {
    // buckets[i] = new LinkedList<>();

    // }

    // // nodes -> add in bucket
    // for (int i = 0; i < oldBuck.length; i++) {
    // LinkedList<Node> ll = oldBuck[i];
    // for (int j = 0; j < ll.size(); j++) {
    // Node node = ll.remove();
    // put(node.key, node.value);
    // }
    // }
    // }

    // // Puts a key-value pair into the HashMap
    // // If key already exists, updates the value
    // public void put(K key, V value) {
    // int bi = hashFunction(key); // bucket index
    // int di = searchInBucket(bi, key); // data index in bucket

    // if (di != -1) {
    // // Key found, update existing value
    // buckets[bi].get(di).value = value;
    // } else {
    // // Key not found, insert new node
    // buckets[bi].add(new Node(key, value));
    // size++;
    // }
    // }

    // // Checks if a key is present in the HashMap
    // public boolean containsKey(K key) {
    // int bi = hashFunction(key);
    // int di = searchInBucket(bi, key);
    // return di != -1;
    // }

    // // Retrieves the value associated with a key
    // // Returns null if key doesn't exist
    // public V get(K key) {
    // int bi = hashFunction(key);
    // int di = searchInBucket(bi, key);

    // if (di != -1) {
    // return buckets[bi].get(di).value;
    // }
    // return null;
    // }

    // // Removes a key-value pair and returns the removed value
    // // Returns null if key doesn't exist
    // public V remove(K key) {
    // int bi = hashFunction(key);
    // int di = searchInBucket(bi, key);

    // if (di != -1) {
    // Node removed = buckets[bi].remove(di);
    // size--;
    // return removed.value;
    // }
    // return null;
    // }

    // // Returns a list of all keys currently in the HashMap
    // public ArrayList<K> keyset() {
    // ArrayList<K> keys = new ArrayList<>();
    // for (LinkedList<Node> bucket : buckets) {
    // for (Node node : bucket) {
    // keys.add(node.key);
    // }
    // }
    // return keys;
    // }

    // // Returns total number of key-value pairs in the HashMap
    // public int size() {
    // return size;
    // }
    // }

    // --------------------
    // Main Function (Testing the Custom HashMap)
    // --------------------

    // --------------------
    // Main Function
    // ! L-11 Anagram(its word or phrase formed by rearranging of letters)
    // public static boolean isAnangram(String s, String t) {
    // // agar length match hee nhi ho rhe false print kro
    // if (s.length() != t.length()) {
    // return false;
    // }
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // char ch = s.charAt(i);
    // map.put(ch, map.getOrDefault(ch, 0) + 1);

    // }

    // for (int i = 0; i < t.length(); i++) {
    // char ch = t.charAt(i);
    // if (map.get(ch) != null) {
    // if (map.get(ch) == 1) {
    // map.remove(ch);
    // } else {
    // map.put(ch, map.get(ch) - 1);

    // }
    // } else {
    // return false;
    // }
    // }
    // return map.isEmpty();
    // }

    // L18
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // starting point
            }
        }

        return null;
    }


    public static void main(String args[]) {
        // ! Lec - 03 (Hashmap Operations)
        // // create
        // HashMap<String, Integer> hm = new HashMap<>();

        // // Insert
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("US", 50);

        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        // // ContainsKey - O(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("Indonesia")); // false

        // // Remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // // size
        // System.out.println(hm.size());

        // // Is Empty
        // hm.clear(); // sara clear krta hai
        // System.out.println(hm.isEmpty()); // mara hashmap khali nhi hai isiliyai
        // false ayai ga

        // ! Lecture 4 (Iteration on Hashmap)
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("US", 50);
        // hm.put("Indonesia", 6);
        // hm.put("Nepal", 5);

        // // Iterate
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // for (String k : keys) {
        // System.out.println("key=" + k + ",value=" + hm.get(k));
        // }


        // ! Lecture 4 (Iteration on Hashmap)
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("US", 50);
        // hm.put("Indonesia", 6);
        // hm.put("Nepal", 5);

        // // Iterate
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // for (String k : keys) {
        // System.out.println("key=" + k + ",value=" + hm.get(k));
        // }

        // L6
        // Create a new HashMap with String keys and Integer values
        // HashMap<String, Integer> map = new HashMap<>();

        // // Inserting key-value pairs
        // map.put("usa", 100);
        // map.put("china", 150);
        // map.put("india", 200);
        // map.put("pakistan", 90);

        // // Display all keys
        // System.out.println("Keys: " + map.keyset());

        // // Retrieve a value
        // System.out.println("Get india: " + map.get("india"));

        // // Check if a key exists
        // System.out.println("Contains usa: " + map.containsKey("usa"));

        // // Remove a key-value pair
        // System.out.println("Removing china: " + map.remove("china"));

        // // Display updated keys and size
        // System.out.println("Updated Keys: " + map.keyset());
        // System.out.println("Size: " + map.size());

        // ! L8
        // LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // lhm.put("India", 100);
        // lhm.put("China", 150);
        // lhm.put("US", 50);

        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("US", 50);

        // ! l9
        // TreeMap<String, Integer> tm = new TreeMap<>();
        // tm.put("India", 100);
        // tm.put("China", 150);
        // tm.put("US", 50);
        // tm.put("Indonesia", 6);

        // System.out.println(lhm);
        // System.out.println(hm);
        // System.out.println(tm);

        // ! L10 Tree map (Majority Element)
        // GIVEN AN INTEGER ARRAY OF SIZE n, find all elements that apper more than n/3
        // times. nums[] = {1,3,2,5,1,3,1,5,1};
        // nums [] = {1,2};

        // int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for (Integer key : map.keySet()) {
        // if (map.get(key) > arr.length / 3) {
        // System.out.println(key); // o/p 1 hee aisa hai jis ki frequency 4 hai
        // }
        // }

        // ! L11
        // String s = "tulip";
        // String t = "lipid";

        // System.out.println(isAnangram(s, t));

        // ! L-12
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);

        // System.out.println(set);

        // if (set.contains(2)) {
        // System.out.println("set contains 2");
        // }

        // System.out.println(set.size());
        // set.clear();
        // System.out.println(set.isEmpty());

        // ! L13(Iteration on HashSet )
        // HashSet<String> cities = new HashSet<>();
        // cities.add("Delhi");
        // cities.add("Mumbai");
        // cities.add("Noida");
        // cities.add("bengalaru");

        // // // USING ITERATORS
        // // Iterator it = cities.iterator();
        // // while (it.hasNext()) {
        // // System.out.println(it.next());
        // // }

        // // using Advanced for-loop
        // for (String city : cities) {
        // System.out.println(city);

        // }

        // // ! L14 using LinkedHashSet
        // LinkedHashSet<String> lhs = new LinkedHashSet<>();
        // lhs.add("Delhi");
        // lhs.add("Mumbai");
        // lhs.add("Noida");
        // lhs.add("Bengaluru");
        // System.out.println(lhs);

        // lhs.remove("Delhi");
        // System.out.println(lhs);

        // // ! L15 TreeSet
        // TreeSet<String> ts = new TreeSet<>();
        // ts.add("Delhi");
        // ts.add("Mumbai");
        // ts.add("Noida");
        // ts.add("Bengaluru");
        // System.out.println(ts);

        // ! L16 Count Distinct Elements
        // // num = {4,3,2,5,6,7,3,4,2,1} o/p=7
        // int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < num.length; i++) {
        // set.add(num[i]);
        // }
        // System.out.println("ans = " + set.size());
        // }

        // ! L17 Union & Intersection of 2 arrays
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();

        // union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("union = " + set.size());

        // intersection
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("intersection = " + count);

    }
}

    // ! L18 (Find iternary(journey) from tickets)

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();

        // ! -L19 (Largest sub array with 0 sum )
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, idx)
        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));

            } else {
                map.put(sum, j);
            }
        }
        System.out.println("largest sub array with sum as 0 => " + len);
        // ! L20 (sub Array equal to k)
        // int arr[] = { 10, 2, -2, -20, 10 };
        // int k = -10;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // // (sum, count)
        // map.put(0, 1);

        // int sum = 0;
        // int ans = 0;

        // for (int j = 0; j < arr.length; j++) {
        // sum += arr[j]; // sum(j)
        // if (map.containsKey(sum - k)) {
        // ans += map.get(sum - k);

        // }
        // map.put(sum, map.getOrDefault(sum, 0) + 1);

        // }
        // System.out.println(ans);
    }
}
