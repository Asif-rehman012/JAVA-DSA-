import java.util.LinkedList; //JCF --> TIME saving, Optimized

public class LinkedlistP2 {

    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ! Lec 2 Detect a cycle in LL

    // function to detect cycle and return starting node(if exists)
    // public static Node isCycle(Node head) {
    // Node slow = head, fast = head;
    // // step 1 : Detect if cycle exists
    // while (fast != null && fast.next != null) {
    // slow = slow.next; // +1
    // fast = fast.next.next; // +2
    // if (slow == fast) {

    // slow = head;
    // while (slow != fast) {
    // slow = slow.next;
    // fast = fast.next;

    // }
    // return slow; // cycle exists...starting node of cycle
    // }
    // }
    // return null; // cycle doen't exist ....no cycle
    // }

    // ! Lec 4 Removing Cycle code

    // Function to remove cycle
    // public static void removeCycle(Node head) {
    // Node slow = head;
    // Node fast = head;
    // boolean cycle = false;

    // // Step 1: Detect cycle
    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;

    // if (slow == fast) { // cycle detected
    // cycle = true;
    // break;
    // }
    // }

    // if (!cycle) {
    // System.out.println("No cycle found.");
    // return;
    // }

    // // Step 2: Find starting point of cycle
    // slow = head;
    // Node prev = null; // will track the node before fast
    // while (slow != fast) {
    // prev = fast;
    // slow = slow.next;
    // fast = fast.next;
    // }

    // // Step 3: Break the cycle
    // prev.next = null;
    // System.out.println("Cycle removed.");
    // }

    // // Helper function to print Linked List
    // public static void printList(Node head) {
    // Node temp = head;
    // while (temp != null) {
    // System.out.print(temp.data + " -> ");
    // temp = temp.next;
    // }
    // System.out.println("null");
    // }

    // ! Merge Sort on LL (code)

    // todo code for get mid
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    // todo CODE FOR MERGE
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next != null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
        // // create a cycle : 5 -> 3
        // head.next.next.next.next.next = head.next.next;

        // Detect cycle
        // Node cycleStart = isCycle(head);
        // if (cycleStart != null) {
        // System.out.println(" Cycle detected at node with value: " + cycleStart.data);
        // } else {
        // System.out.println("No Cycle detected. ");
        // }

        // Main function

        // Call removeCycle
        // removeCycle(head);

        // Print list after removing cycle
        // printList(head);

        // ! L7 Linkedlist in collections Framework
        // todo Doing with the help of JCF not with big scratch code

        // create -
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(3);
        ll.addFirst(4);
        // 0->1->2->3->4
        // System.out.println(ll);
        // remove
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);

        // Question no.9
        ll.print();
        ll.head = mergeSort(ll.head);

    }
}
