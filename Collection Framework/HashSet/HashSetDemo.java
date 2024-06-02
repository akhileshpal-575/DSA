import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        
   HashSet<Integer> hs = new HashSet<>();
   hs.add(84);
   hs.add(85);
   hs.add(45);
   hs.add(67);
   hs.add(88);

    HashSet<Integer> h= new HashSet<>();
    //addAll()
    h.addAll(hs);
    h.add(99);
    System.out.println(h);

    //removeAll()
    h.removeAll(hs);
    System.out.println(h);//[99]

    

     
}
}
