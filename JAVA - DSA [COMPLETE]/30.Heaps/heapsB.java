import java.util.PriorityQueue;
import java.util.*;

public class heapsB {

    // ! L4/l4
    // static class Student implements Comparable<Student> {
    // String name;
    // int rank;

    // public Student(String name, int rank) {
    // this.name = name;
    // this.rank = rank;
    // }

    // @Override
    // public int compareTo(Student s2) {
    // return this.rank - s2.rank; // ascending order (lower rank = higher priority)
    // }
    // }

    // ! L8 Delete (remove from Heap)
    // ArrayList<Integer> arr = new ArrayList<>();

    // // Insert into heap
    // public void add(int data) {
    // arr.add(data);
    // int curr = arr.size() - 1;

    // // Heapify up
    // while (curr > 0) {
    // int parent = (curr - 1) / 2;
    // if (arr.get(curr) > arr.get(parent)) {
    // swap(curr, parent);
    // curr = parent;
    // } else {
    // break;
    // }
    // }
    // }

    // // Remove root (max element)
    // public void remove() {
    // if (arr.size() == 0) {
    // System.out.println("Heap is empty.");
    // return;
    // }

    // // Step 1: Swap root with last element
    // int lastIdx = arr.size() - 1;
    // swap(0, lastIdx);

    // // Step 2: Remove last element (former root)
    // arr.remove(lastIdx);

    // // Step 3: Heapify down from root
    // int curr = 0;
    // while (true) {
    // int left = 2 * curr + 1;
    // int right = 2 * curr + 2;
    // int largest = curr;

    // if (left < arr.size() && arr.get(left) > arr.get(largest)) {
    // largest = left;
    // }

    // if (right < arr.size() && arr.get(right) > arr.get(largest)) {
    // largest = right;
    // }

    // if (largest == curr) {
    // break;
    // }

    // swap(curr, largest);
    // curr = largest;
    // }
    // }

    // // Swap helper
    // private void swap(int i, int j) {
    // int temp = arr.get(i);
    // arr.set(i, arr.get(j));
    // arr.set(j, temp);
    // }

    // // Print heap
    // public void printHeap() {
    // System.out.println(arr);
    // }

    // ! L9 Heap sort (sorting in ascending order)
    // public static void heapify(int arr[], int i, int size) {
    // int left = 2 * i + 1;
    // int right = 2 * i + 2;
    // int maxIdx = i;

    // if (left < size && arr[left] > arr[maxIdx]) {
    // maxIdx = left;

    // }

    // if (right < size && arr[right] > arr[maxIdx]) {
    // maxIdx = right;
    // }
    // if (maxIdx != i) {
    // // swap
    // int temp = arr[i];
    // arr[i] = arr[maxIdx];
    // arr[maxIdx] = temp;

    // heapify(arr, maxIdx, size);
    // }
    // }

    // public static void heapSort(int arr[]) {
    // // step1 - build maxHeap
    // int n = arr.length;
    // for (int i = n / 2; i >= 0; i--) {
    // heapify(arr, i, n);
    // }
    // // step2 - push largest at end
    // for (int i = n - 1; i > 0; i--) {
    // // swap (largest-first with last)
    // int temp = arr[0];
    // arr[0] = arr[i];
    // arr[i] = temp;

    // heapify(arr, 0, i);
    // }
    // }

    // ! L10 Nearby cars(find minimum distance of cars from origin to cars)
    static class point implements Comparable<point> {
        int x;
        int y;
        int distSq;
        int idx;

        public point(int x, int y, int distSq, int i) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(point p2) {
            return this.distSq - p2.distSq;

        }
    }

    public static void main(String[] args) {

        // PriorityQueue<Student> pq = new PriorityQueue<>();

        // pq.add(new Student("A", 4));
        // pq.add(new Student("B", 5));
        // pq.add(new Student("C", 2));
        // pq.add(new Student("D", 4));

        // while (!pq.isEmpty()) {
        // Student s = pq.peek(); // O(1)
        // System.out.println(s.name + " -> " + s.rank);
        // pq.remove(); // O(log n)

        // L8
        // heapsB heap = new heapsB();

        // heap.add(50);
        // heap.add(30);
        // heap.add(20);
        // heap.add(15);
        // heap.add(10);
        // heap.add(8);
        // heap.add(16);

        // System.out.println("Initial heap:");
        // heap.printHeap();

        // heap.remove(); // removes max (50)
        // System.out.println("After removing root:");
        // heap.printHeap();

        // // L9
        // int arr[] = { 1, 2, 4, 5, 3 };
        // heapSort(arr);

        // // print
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // L10
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], distSq, i));
        }

        // nearest K cars
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}
