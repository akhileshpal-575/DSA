import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //add operation
        list.add(1);//O(1)
        list.add(2);
        list.add(5);
        list.add(6);
        System.out.println(list);
        
        //add at particular index
       // list.add(1,9 );
      //System.out.println(list); //output : 1 9 2 5  

        //Get operation
       //System.out.println(list.get(2)); //return element at specific position in list.
         
        //remove operation
        //System.out.println(list.remove(2));//return element that is delete from list for that particular index.
        //System.out.println(list);     
        
       // list.set(3,8);
        //System.out.println("list after set element at index" +list);     
    
        //contains element check the existence of an element in list. 
        // System.out.println(list.contains(6));//return boolean 
        //System.out.println(list.contains(11));
        
        //iterate ArrayList
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // //printing reverse 
        // for (int i = list.size()-1; i>=0; i--) {
        //     System.out.println(list.get(i));
        // }

    }
}