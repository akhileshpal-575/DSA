import java.util.*;
import java.util.LinkedList;
public class QueueUsingDeque {
    static class Queue{
      static Deque<Integer>deque = new LinkedList<>();

        public static void add(int data){
            deque.addLast(data);
        }
        public static int remove(){
          return deque.removeFirst();
        }
        public static int peek(){
            return deque.peek();        }
    }
    public static void main(String[] args) {
     Queue q = new Queue();
     q.add(4);
     q.add(2);
     q.add(5);
     
     System.out.println(q.peek());
    }
}
