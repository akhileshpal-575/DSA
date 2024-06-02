import java.util.*;
public class LinkedListMethod {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        l.add("abc");
        l.add("bcd");
        l.add("cde");

        System.out.println(l);
        
        l.addFirst("A");
        l.addLast("Z");

        System.out.println(l.getFirst());
        System.out.println(l.getLast());

    }
}
