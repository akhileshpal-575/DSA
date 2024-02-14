public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // adding Node at first.
    public void addFirst(int data) {// O(1)
        // step 1 : create node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 : newNode next = head
        newNode.next = head;
        // step 3 : head = newNode
        head = newNode;
    }

    // adding Node at last
    public void addLast(int data) { // O(1)
        // step1
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2
        tail.next = newNode;
        // step3
        tail = newNode;
    }

    // adding Node at a index.
    public void add(int data, int idx) { // O(n)
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public int removeFirst() { // O(1)
        if (size == 0) {
            System.out.println("list is empty");
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

    // Remove last
    public int removeLast() { // O(n)
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search element in a LinkedList
    public int search(int key) { // O(n)
        if (head == null) {
            System.out.println("list is empty");
        }
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // searching using recusion .
    public int reSearch(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) { // O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // reverse a LinkedList
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

    // delete Nth node from the end
    public void deleteNthfromEnd(int n) {
        if (n == size) {
            head = head.next; // removeFirst
            return;
        }
        int i = 1;
        Node prev = head;
        while (i < size - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // find middle Node by using slow fast approach.
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;   //for mergeSort fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my mid Node
    }

    // check palindrome list
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 find mid
        Node midNode = findMiddle(head);
        // step2 reverse 2nd half
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
        Node left = head; // left half head

        // step 3 check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // DetectLoop/Cycle in linkedList.
    public boolean isCycle() { // floyd cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle exist
            }
        }
        return false;
    }

    // Removing cylce in a linkedList
    public void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                // find meeting point
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
                // remove cycle -> last.next = null
                prev.next = null;
            }
        }
    }
    // ............................
    // MergeSort in LinkedList

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    // merge list
    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
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
        return mergeLL.next;

    }

    // mergeSort O(nlogn)
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right half
        Node rightNode = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightNode);
        // merge
        return merge(newLeft, newRight);
    }

    // Zig zag LinkedList
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL;
        Node nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    // printing list
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        // ll.print();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(3);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
// We have created.
// 01. addFirst()
// 02. addLast()
// 03. add() //add at given index
// 04. removeFirst()
// 05. removeLast()
// 06. search()
// 07. search recursively
// 08. reverse()
// 09. print()
// 10. deleteNthfromEnd()
// 11. findMiddle()
// 12. checkPalindrome()
// 13. detectLoop/cycle in linked list isCycle()
// 14. remove detected loop/cycle
// 15. mergeSort
// 16. zigZag LinkedList