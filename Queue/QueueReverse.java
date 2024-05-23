import java.util.*;
import java.util.LinkedList;
public class QueueReverse {
    public static void reverse(Queue<Integer>q){
            if(q.isEmpty()){
                return;
            }
            int val = q.remove();
            reverse(q);
            q.add(val);
            while(!q.isEmpty()){
                System.out.print(q.remove()+" ");
            }
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        for(int i = 1; i<=5; i++){
            q.add(i);
        }
        reverse(q);
    }
}
