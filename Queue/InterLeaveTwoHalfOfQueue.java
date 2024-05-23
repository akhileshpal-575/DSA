import java.util.*;
import java.util.LinkedList;
public class InterLeaveTwoHalfOfQueue {
 
    public static void interleaveQueue(Queue<Integer>q){
        Queue<Integer> first = new LinkedList<>();
        //first half
        int size = q.size(); 

        for(int i = 0; i<size/2; i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        for(int i = 1; i<=10; i++){
            q.add(i);
        }
        interleaveQueue(q);
    }
}
