import java.util.*;
/**
 * LinkedHashSetExample
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {
        
        LinkedHashSet<Integer>lset = new LinkedHashSet<>();
        lset.add(300);
        lset.add(994);
        lset.add(494);
        lset.add(9038);

        System.out.println(lset);//insertion order is preserved

        //remove
        lset.remove(494);
        System.out.println(lset);

       //Note:whatever the methods we have used in HashSet the same are applicable here.
       
       

    }
}