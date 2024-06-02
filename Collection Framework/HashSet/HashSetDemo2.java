import java.util.*;
public class HashSetDemo2 {
    public static void main(String[] args) {
        
     HashSet<Integer> set1 = new HashSet<>();
     set1.add(84);
     set1.add(85);
     set1.add(45);
     set1.add(67);
     set1.add(88);
    
     HashSet<Integer> set2 = new HashSet<>();
     set2.add(84);
     set2.add(85);
     set2.add(55);
     
     //union
     //set1.addAll(set2);
     //System.out.println("union "+set1);

     //intersection
     //set1.retainAll(set2);
     //System.out.println("intersection "+set1);

     //Difference
     //set1.removeAll(set2);
     //System.out.println("difference "+set1);

     //subset
     System.out.println(set1.containsAll(set2));//return true if set2 is subset of set1 else return false.
    
    }
}
