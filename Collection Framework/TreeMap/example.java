import java.util.*;
public class example {
    public static void main(String[] args) {
        TreeMap<String,Integer>m = new TreeMap<>();
        // put,get,remove O(log n)

        m.put("aman",1);
        m.put("naman",2);
        m.put("ajay",3);
        m.put("amit",4);
        m.put("ankur",5);
        
        // gives a key sorted map
        System.out.println(m);
    }
}
