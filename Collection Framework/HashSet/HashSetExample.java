import java.util.*;

public class HashSetExample{
    public static void main(String[] args) {
    //HashSet hs = new HashSet();//default capacity 16 load factor 0.75
    //HashSet hs = new HashSet(100)//initial capacity
    
    HashSet<Integer> hs = new HashSet<Integer>();    

    //add elements or objectts into HashSet
    hs.add(34);
    hs.add(85);
    hs.add(93);
    hs.add(94);
    System.out.println(hs);

    //remove
    hs.remove(93); //remove object/value
    System.out.println("after removing "+hs);
    
    System.out.println(hs.contains(94));

    System.out.println(hs.isEmpty());
    
    // //reading objects using for .. each loop
    // for (Integer e : hs) {
    //     System.out.println(e);
    // }

    // //iterator method 
    // Iterator it = hs.iterator();
    // while(it.hasNext()){
    //     System.out.println(it.next());
    // }

    
    

}

}