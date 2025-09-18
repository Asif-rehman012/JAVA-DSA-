public class LinkedList {
    // ! L1 Linked liat
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ! L2 Linked list Head-Tail
    public static Node head;
    public static Node tail;
    public static int size;

    // !L3 addFirst
    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        // step2 - newNode next = head
        newNode.next = head;
        // step3 - head = newNode
        head = newNode;
    }

    // ! addLast Add in LL
    public void addLast(int data) {
        Node newnNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnNode;
            return;

        }
        tail.next = newnNode;
        tail = newnNode;
    }

    // ! L5 Print LinkedList
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null--LL is Empty");
    }

    // !L6 Add in the Middle L7 Size of arrayList
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++; // jaisai nya node bnai fir size ++
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i= idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ! Remove First , Remove Last element
    // ! L8 Remove First------''''If,else are just used for special cases
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // !L9 removelast element
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i= size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // ! L10 Itterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // ! L11 Search Recursive
    public int searchRecursive(Node node, int key) {
        // Base case : list empty
        if (node == null) {
            return -1;
        }

        // if key is found
        if (node.data == key) {
            return 0;
        }

        // Search in rest of the list
        int idx = searchRecursive(node.next, key);
        if (idx == -1) {
            return -1; // not found in rest
        } else {
            return idx + 1; // sshift index forward
        }
    }

    // !L12 Reverse linked list

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // ! L13 Find and remove nth node from End
    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

            if (n == sz) {
                head = head.next; // removeFirst
                return;
            }

            // sz-n
            int i = 1;
            int iToFind = sz - n;
            Node prev = head;
            while (i < iToFind) {
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;
        }

    }

    // ! L14 Check if Linked liat ia palindrome
    // Slow-Fast Approach
    public Node findMid(Node head) { // helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            return slow; // slow is my midNode

        }
        return slow;
    }

    public boolean CheckPalindrome() {

        if (head == null || head.next != null) {
            return true;
        }

        // step1 - find mid
        Node midNode = findMid(head);
        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // step 3 - check left half and rt half

        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // todo create a New linked-list now create all nodes inside it
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1); // head mai nya node bna jis mai store huva 1
        // li.head.next = new Node(2); // woh point kr rha hai nyi node ko jha store
        // hota 2
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print(); // 1->2->3->4->5
        // System.out.println(ll.size); // size++ have to be added in functions like
        // addfirst, addlast, in Add func.
        // after the base case
        // remove first Lec 8
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(3));
        // ll.insertAtEnd(10);

        // L12
        // ll.reverse();
        // ll.print();

        // L13
        // ll.deleteNthfromEnd(3);
        // ll.print();

        // L14-L15 Check is a number pallindrome or not
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1->2->2->1
        System.out.println(ll.CheckPalindrome());
    }
}
