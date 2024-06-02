import java.util.*;
class LinkedListExample{
    public static void main(String[] args) {
        
        //LinkedList l = new LinkedList<>();//can store hetrogenous data.
        LinkedList<Integer> list = new LinkedList<>();
        
        //add element into linked list
        list.add(100);
        list.add(233);
        list.add(342);
        list.add(564);
        list.add(234);
        System.out.println("list "+list);
        //size of linkedList
        System.out.println("list size "+list.size());

        //remove
        list.remove(1);
        System.out.println("elements after removing "+list);
        
        //insert or adding element in the middle of LinkedList
        list.add(2,999); //insert at index 2
        System.out.println("insert at middle than list "+list);
        
        //retriving value/object
        System.out.println(list.get(3));

        //change the value 
        list.set(3,1000);
        System.out.println("list after set operation "+list);

        System.out.println(list.contains(999));//return true
        System.out.println(list.contains(111));

        //isEmpty()
        System.out.println("is list empty "+list.isEmpty());
        
        //reading elements from LinkedList using for each loop
        for(Integer e:list){
           System.out.print(e+" ");
       }
        System.out.println();
        
        //reading element from LinkedList using for loop
          for (int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i));
          }
           System.out.println();
        
           //iterator method for reading elements
        Iterator it = list.iterator();
        while(it.hasNext()){
           System.out.print(it.next()+" ");
        }

    }
 }