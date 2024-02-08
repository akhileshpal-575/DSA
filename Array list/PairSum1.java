import java.util.*;

public class PairSum1 {
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        //Brutforce...O(n2)

        // for(int i = 0; i<list.size()-1; i++){
        //     for(int j = i+1; j<list.size()-1;j++){
        //         if(list.get(i)+list.get(j) == target){
        //          return true;
        //         }
        //     }
        // }
        // return false;

        //Two pointer approach..O(n).. best for sorted list.
          int lp = 0;
          int rp = list.size()-1;
          while(lp<rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            else if(list.get(lp)+list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
          }
        return false;
    }
    public static void main(String[] args) {
       //find any pair in a sorted arraylist has a target sum.
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 4;

      System.out.println(pairSum1(list,target));  
    }
}
