import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {

    // // !L6 swap 2 numbers
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    // int temp = list.get(idx1);
    // list.set(idx1, list.get(idx2)); // index 2 ki value 1 pai store hogi
    // list.set(idx2, temp);
    // }

    // !L10 Water store flipkart
    // public static int storeWater(ArrayList<Integer> height) {
    // int maxWater = 0;
    // // brute force- O(n^2)
    // for (int i = 0; i < height.size(); i++) {
    // for (int j = i + 1; j < height.size(); j++) {
    // int ht = Math.min(height.get(i), height.get(j));
    // int width = j - 1;
    // int currWater = ht * width;
    // maxWater = Math.max(maxWater, currWater);
    // }
    // }
    // return maxWater;
    // }

    // ! L11 --- 2 pointer approach
    // public static int storeWater(ArrayList<Integer> height) {
    // int maxWater = 0;
    // int lp = 0;
    // int rp = height.size() - 1;

    // while (lp < rp) {
    // // calculate water area
    // int ht = Math.min(height.get(lp), height.get(rp));
    // int width = rp - lp;
    // int currWater = ht * width;
    // maxWater = Math.max(maxWater, currWater);

    // // update ptr
    // if (height.get(lp) < height.get(rp)) {
    // lp++;
    // } else {
    // rp--;
    // }
    // }

    // return maxWater;
    // }

    // !L13 ! PairSum-1 Problem
    // Brute Force
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;

    // }
    // }
    // }

    // return false;
    // }

    // ! L14 2 pointer approach
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    // int lp = 0;
    // int rp = list.size() - 1;

    // while (lp != rp) {
    // // case 1
    // if (list.get(lp) + list.get(rp) == target) {
    // return true;
    // }

    // // case 2
    // if (list.get(lp) + list.get(rp) < target) {
    // lp++;

    // } else {
    // // case 3
    // rp--;
    // }
    // }
    // return false;
    // }

    // ! L16 Pair Sum-2
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;// smallest
        int rp = bp; // largest

        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // ! L2 Operations on Arraylist
        // ClassName objectName = new ClassName();
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();
        // ArrayList<String> fruits = new ArrayList<>();

        // list.add(10);// O(1)
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(54);

        // todo we can directly add at any index
        // list.add(1, 79);

        // System.out.println(list);

        // // Get Operation O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // // Delete
        // list.remove(2);
        // System.out.println(list);

        // // Set Element at Index
        // list.set(1, 15);
        // System.out.println(list);

        // // Contains Element
        // System.out.println(list.contains(20)); // if 20 exists in list it gives True
        // System.out.println(list.contains(88));

        // System.out.println(list.size());

        // // print the ArrayList
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // // L4 Print reverse of an arraylist
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");
        // }

        // !L5 Find Max in an arraylist
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        // // if (max < list.get(i)) {
        // // max = list.get(i);
        // // }

        // // replacing if condn with math func
        // max = Math.max(max, list.get(i)); // easy way
        // }
        // System.out.println("max element = " + max);

        // ! L6 swap numbers call
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // !L7 Sorting an ArrayList
        // System.out.println("orginal list" + list);
        // Collections.sort(list); // ascending order
        // System.out.println(list);

        // // Printing list in descending order
        // Collections.sort(list, Collections.reverseOrder()); // comparator- fnx logic
        // System.out.println(list);

        // !L8 ArrayList implementation in java
        // ! L9 Multidimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(27);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);

        // for (int i = 0; i < mainList.size(); i++) { // mainL sai curr nikalo
        // ArrayList<Integer> currList = mainList.get(i);
        // // will run loop for curr list
        // for (int j = 0; j < currList.size(); j++) {
        // System.out.print(currList.get(j) + " ");
        // }
        // System.out.println();
        // }

        // todo Lecture 9 todo WRITE TABLE OF 1 , 2, AND 3
        // System.out.println("******---MUL TABLE OF 1,2 & 3 IN ARRAYLIST ");
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> List1 = new ArrayList<>();
        // ArrayList<Integer> List2 = new ArrayList<>();
        // ArrayList<Integer> List3 = new ArrayList<>();

        // for (int i = 1; i <= 5; i++) {
        // List1.add(i * 1); // 1 2 3 4 5
        // List2.add(i * 2); // 2 4 6 8 10
        // List3.add(i * 3); // 3 6 9 12 15

        // }

        // mainList.add(List1);
        // mainList.add(List2);
        // mainList.add(List3);

        // System.out.println(mainList);

        // // nested loops
        // for (int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> currList = mainList.get(i);
        // for (int j = 0; j < currList.size(); j++) {
        // System.out.print(currList.get(j) + " ");
        // }
        // System.out.println();
        // }

        // ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // int target = 8;

        // ? for pair 2 sum
        ArrayList<Integer> list = new ArrayList<>();

        // 11, 15, 6, 8, 9, 10 -- sorted & rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));

        // System.out.println(storeWater(height));
        // System.out.println(pairSum1(height, 8));
        System.out.println(pairSum1(list, target));
    }

}
