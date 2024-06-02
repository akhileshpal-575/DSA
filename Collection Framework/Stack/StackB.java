import java.util.*;
public class StackB {
public static void main(String[] args) {
// Stack s = new Stack();    
Stack<Integer> s = new Stack<>();    
s.push(938);
s.push(987);
s.push(688);

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
   }
 }    
}