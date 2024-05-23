import java.util.*;
import java.util.LinkedList;
public class StackUsingDeque {
    static class Stack{
    static Deque<Integer>deque = new LinkedList<>();
    
    public static boolean isEmpty(){
        return deque.isEmpty();
    }
    public static void push(int data){
     deque.addLast(data);
    }
    public static int pop(){
        if(deque.isEmpty()){
            System.out.println("empty");
            return -1;
        }
       return deque.removeLast();
    }
    
    public static int peek(){
        if(deque.isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return deque.getLast();
    }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.isEmpty())
        System.out.println(s.pop());
    }
}
