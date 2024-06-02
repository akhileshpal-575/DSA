import java.util.*;
public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList list  = new LinkedList();

        list.add("C");
        list.add("F");
        list.add("A");
        list.add("Z");
        System.out.println("list "+list);

        LinkedList list2 = new LinkedList();
        list2.addAll(list);//copy list into list2
        System.out.println("list2 "+list2);
        
        list2.removeAll((list));//remove all list element from list2
        System.out.println(list2);//[]

        //sort  
        System.out.println("before sorting "+list);
        Collections.sort(list);
        System.out.println("after sorting "+list);
           
        //reverseorder
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("reverse order "+ list);

        //shuffle
        Collections.shuffle(list);
        System.out.println("after shuffle "+list);
    }
}
