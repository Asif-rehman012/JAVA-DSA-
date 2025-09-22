
// import java.util.ArrayList;
import java.util.*;

public class stackB {
    // todo To create a stack we mostly use 4 functions push, pop, peek, isEmpty()
    // ! LEC 2: Stack using ArrayList
    // static class Stack {
    // static ArrayList<Integer> list = new ArrayList<>();

    // // Gives true or false--->
    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // // push
    // public static void push(int data) {
    // list.add(data);
    // }

    // // pop
    // // sb sai phalai top ko nikal diya fir top ko remove krdiya fir return
    // public static int pop() {
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return top;
    // }

    // // peek
    // public static int peek() {
    // return list.get(list.size() - 1);

    // }
    // }

    // ! LEC 3: STACK USING LINKED-LIST
    // static class Node {
    // // todo Iss kai andr store krai gai data aur next pointer
    // // todo iss ka constructor bnayi gai jis kai andr data har bar pass krai gai
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // static class Stack {
    // static Node head = null;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // // push
    // public static void push(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }
    // newNode.next = head;
    // head = newNode;
    // }

    // // pop
    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }
    // }

    // ! L5 Q1 Push at the bottom of Stack
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    // if (s.isEmpty()) {
    // s.push(data);
    // return;
    // }
    // int top = s.pop();
    // pushAtBottom(s, data);
    // s.push(top);
    // }

    // ! L6 Reverse a string using a stack
    // public static String reverseString(String str) {
    // Stack<Character> s = new Stack<>();
    // int idx = 0;
    // while (idx < str.length()) {
    // s.push(str.charAt(idx));
    // idx++;
    // }
    // StringBuilder result = new StringBuilder("");
    // while (!s.isEmpty()) {
    // char curr = s.pop();
    // result.append(curr);

    // }
    // return result.toString();
    // }

    // ! l7 Reverse a Stack (pushatbottom L5 + recursion )
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    // if (s.isEmpty()) {
    // s.push(data);
    // return;
    // }
    // int top = s.pop();
    // pushAtBottom(s, data);
    // s.push(top);
    // }

    // public static void reveseStack(Stack<Integer> s) {
    // if (s.isEmpty()) {
    // return;
    // }
    // int top = s.pop();
    // reveseStack(s);
    // pushAtBottom(s, top);

    // }

    // public static void printStack(Stack<Integer> s) {
    // while (!s.isEmpty()) {
    // System.out.println(s.pop());
    // }
    // }

    // ! L8 Stock Span Problem
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();

            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // Stack<Integer> s = new Stack<>(); // JCF easy way
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // 3, 2, 1
        // ! JB TK STACK EMPTY NHI HOGA TBTK POP, PEEK KRAI GAI
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        // L5
        // pushAtBottom(s, 4);
        // while (!s.isEmpty()) {
        // System.out.println(s.pop());

        // }

        // L6
        // String str = " abc ";
        // String result = reverseString(str);
        // System.out.println(result);

        // L7
        // reveseStack(s);
        // printStack(s);
        // // 1, 2, 3

        // L8
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
