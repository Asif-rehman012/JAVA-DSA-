import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

//! From this line of implementation start
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class Queue {
//     Node front, rear;
//     int size; // max capacity
//     int count; // current elements

//     Queue(int size) {
//         this.front = this.rear = null;
//         this.size = size;
//         this.count = 0;
//     }

//     // Add element (like offer in JCF)
//     void add(int data) {
//         if (count == size) {
//             System.out.println("Queue Overflow! Cannot insert " + data);
//             return;
//         }

//         Node newNode = new Node(data);

//         if (rear == null) { // empty queue
//             front = rear = newNode;
//         } else {
//             rear.next = newNode;
//             rear = newNode;
//         }
//         count++;
//     }

//     // Remove element (like poll/remove in JCF)
//     int remove() {
//         if (front == null) {
//             System.out.println("Queue Underflow! Queue is empty");
//             return -1;
//         }

//         int value = front.data;
//         front = front.next;
//         if (front == null)
//             rear = null;
//         count--;
//         return value;
//     }

//     // Peek element (front element without removing)
//     int peek() {
//         if (front == null) {
//             System.out.println("Queue is empty!");
//             return -1;
//         }
//         return front.data;
//     }

//     // Display queue
//     void display() {
//         if (front == null) {
//             System.out.println("Queue is empty!");
//             return;
//         }
//         Node temp = front;
//         while (temp != null) {
//             System.out.print(temp.data + " <- ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }
// !Implementaion end

public class queuesB {

    // ! Lecture : 6
    // static class Queue {
    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();

    // // agar s1 khali hai tou pora queue khali hai
    // public static boolean isEmpty() {
    // return s1.isEmpty();
    // }

    // // adding elements in queue---O(N) mai kiya
    // public static void add(int data) {
    // while (!s1.isEmpty()) { // jb tkk s1 khali na hoga
    // s2.push(s1.pop()); // tbtk s1 kai elements pop krayai aur s2 mai push
    // }

    // // dusra step wapis s1 mai push
    // s1.push(data);

    // // 3rd step
    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }

    // }

    // // ab krai gai apnai Remove function ko
    // public static int remove() { // ---O(1) constant time mai impl
    // // phalai check krai gai empty tou nhi hai
    // if (isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // // nhi tou return krai gai s1.pop
    // return s1.pop();
    // }

    // // same way mai peek dekhai gai---O(1) constant time mai impl
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // // nhi tou return krai gai s1.pop
    // return s1.peek();
    // }
    // }

    // ! L=07 Stack using 2 Queues
    // iss bar stack ko create kr rhai hoga
    // static class Stack {
    // // 2 queue sai 1 Stack bnai ga... will implement with jcf
    // static Queue<Integer> q1 = new LinkedList<>();
    // static Queue<Integer> q2 = new LinkedList<>();

    // public static boolean isEmpty() { // we dont know kis mai elements hai
    // return q1.isEmpty() && q2.isEmpty();
    // }

    // public static void push(int data) {
    // if (!q1.isEmpty()) {
    // q1.add(data);
    // } else {
    // q2.add(data);
    // }
    // }

    // // tbtk elements nikalai gai jbtk last element tk na pounch jayai gai
    // // un sarai elements ko q2 mai dalai gai
    // public static int pop() {
    // if (isEmpty()) {
    // System.out.println("empty stack");
    // return -1;
    // }

    // int top = -1;

    // // todo ek CASE 1 MAI JB SARAI ELEMENTS HO --- CASE 2 MAI JB SARAI ELEMENTS
    // HO
    // // case 1
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {
    // top = q1.remove();
    // if (q1.isEmpty()) { // jaisaihe q1 empty hoga loop sai krai gai break
    // break;
    // }

    // q2.add(top);
    // // agar last element nhi hai tou q2 mai add krai gai
    // }
    // } else { // case 2 same cheez karai gai yha b
    // while (!q2.isEmpty()) {
    // top = q2.remove();
    // if (q2.isEmpty()) {
    // break;
    // }
    // q1.add(top);
    // }
    // }
    // return top; // break krtai hee uss element ko krai yha sai return
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty stack");
    // return -1;
    // }

    // int top = -1;

    // // todo ek CASE 1 MAI JB SARAI ELEMENTS HO --- CASE 2 MAI JB SARAI ELEMENTS
    // HO
    // // case 1
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {
    // top = q1.remove();
    // q2.add(top);
    // // agar last element nhi hai tou q2 mai add krai gai
    // }
    // } else { // case 2 same cheez karai gai yha b
    // while (!q2.isEmpty()) {
    // top = q2.remove();
    // q1.add(top);
    // }
    // }

    // return top; // break krtai hee uss element ko krai yha sai return
    // }
    // }

    // ! Lecture= 08 Print Non-repeating number(explanation on copy)
    // public static void printNonRepeating(String str) {
    // int freq[] = new int[26]; // 'a'-'z'
    // Queue<Character> q = new LinkedList<>();

    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // q.add(ch);
    // freq[ch - 'a']++;

    // while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
    // q.remove();
    // }
    // if (q.isEmpty()) {
    // System.out.print(-1 + " ");
    // } else {
    // System.out.print(q.peek() + " ");
    // }
    // }
    // System.out.println();
    // }

    // ! L9 Q5: Interleave 2 Halves of a Queue (even length)
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove()); // q sai remove krna hai fir q mai hee add krna hai
        }
    }

    // ! L=10 QUEUE Reversal
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        // ! LECTURE : 4, 5
        // todo ***Calling q.display() But Queue (interface) doesn't have display method
        // error
        // Queue q = new Queue(3); // capacity = 3
        // todo QUEUE kbi class nhi hota interface hota hai
        // // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        // // can implement queue with either Linkedlist or ArrayDeque kyuki que queue
        // // class haiue ka koyi obj nhi bn sakhta
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // // q.display(); // 1 <- 2 <- 3 <- null
        // System.out.println(q);
        // q.add(4); // Overflow

        // System.out.println("Removed: " + q.remove()); // removes 1
        // // q.display(); // 2 <- 3 <- null
        // System.out.println(q);

        // System.out.println("Front element: " + q.peek()); // 2

        // q.add(5);
        // // q.display(); // 2 <- 3 <- 5 <- null
        // System.out.println(q);

        // Lec 6
        // Stack s = new Stack();
        // s.push(1); // FIXED: use push, not add
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        // L8
        // String str = "aabccxb";
        // printNonRepeating(str);

        // 9
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // interLeave(q);
        // // print Q //jbtk khali na hogi tbtk pop kr doo
        // while (!q.isEmpty()) {
        // System.out.print(q.remove() + " ");
        // }
        // System.out.println();
        // }

        reverse(q);
        // print Q
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        System.out.println();
    }
}