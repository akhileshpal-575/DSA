public class DoublyLinkedList {
    
    public class Node{
        int data;
        Node next;
        Node prev;

       public Node(int data){
           this.data = data;
           this.next = null;
           this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
         if(head == null){
        head = tail = newNode;
        return;
      }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
     }

    //removeFirst
    public int removeFirst(){
        if(head == null){
            System.out.println("empty");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // removeLast
    public int removeLast(){
        if(head == null){
            System.out.println("empty");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        int i = 0;
        while(i<size-2){
        prev = prev.next;
        i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        return val;
    }
    //reverseDll
     public void reverseDll(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
     }
    //print
    public void print(){
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.data + "<->");
        temp = temp.next;
      }     
      System.out.println("null");
    }

    public static void main(String[] args) {
      DoublyLinkedList dll = new DoublyLinkedList();  
      dll.addFirst(45);
      dll.addFirst(54);
      dll.addFirst(76);
      dll.print();
      System.out.println(dll.removeLast());
      dll.print();
    }
}

//we have 
//01. addFirst
//02. addLast
//03. removeFirst
//04. removeLast
//05. print()
//06. reverseDll()
