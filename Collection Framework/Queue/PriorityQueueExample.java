import java.util.*;
class PriorityQueueExample{
    public static void main(String[] args) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // hetrogeneous data not allowed in Queue
        //add
        q.add(45);
        q.add(88);
        q.add(89);
        q.offer(90);
        
        System.out.println(q);

        //get head element
        // System.out.println(q.element());//if empty return NoSuchElementException
        // System.out.println(q.peek());//return head ,return null if empty
        
        // //return and remove the element from the Queue
        // System.out.println(q.remove());//45
        System.out.println(q.remove(45));//return true and remove 45 from the Queue
       
        // System.out.println(q.poll());//remove head and if empty return null
        // System.out.println(q);

        // Iterator method
        // Iterator it = q.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // //for..each loop
        // for (Integer e : q) {
        //     System.out.println(e);
        // }

        
    }
}