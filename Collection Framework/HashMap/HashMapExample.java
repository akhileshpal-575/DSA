import java.util.*;
class HashMapExample{
    public static void main(String[] args) {
     HashMap<Integer,String>m = new HashMap<>();   
    //  HashMap m = new HashMap();
    
    m.put(101,"aman");
    m.put(102,"naman");
    m.put(103,"ajay");
    m.put(104,"amit");
    m.put(105,"ankur");

    System.out.println(m); 
//     System.out.println(m.get(105));

//   m.remove(104); //remove pair from HashMap
//   System.out.println(m);
 
//  System.out.println("contains key "+m.containsKey(103)); // return true if map contains mapping for this key 
//  System.out.println("contaisn key"+m.containsKey(104));;

//  System.out.println("contains value "+m.containsValue("naman")); 
//  System.out.println("contains value "+m.containsValue("amit"));

//  System.out.println(m.isEmpty());
 
// //  return all the keys as Set
//  System.out.println(m.keySet());

//  return all the values as Collection
//  System.out.println(m.values());

//return all the entryies as set 
System.out.println("entries as set "+m.entrySet());

//read each key individuals
// for (Object e:m.keySet()) {
//     System.out.print(e+" ");
// }
// System.out.println();

//read values
// for (Object e : m.values()) {
//     System.out.print(e+" ");
// }
// System.out.println();

//capture key along with values
// for (Object i : m.keySet()) {
//     System.out.println(i+"->"+m.get(i));    
// }

//Entry method
// for(Map.Entry e:m.entrySet()){
//     System.out.println(e.getKey()+" "+e.getValue());
// }

//Iterator method 
// Set s= m.entrySet();
// Iterator it = s.iterator();
// while(it.hasNext()){
//     Map.Entry e = (Map.Entry)it.next();
//     System.out.println(e.getKey()+" "+e.getValue());
// }
}
}