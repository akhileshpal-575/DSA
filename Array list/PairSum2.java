import java.util.*;

public class PairSum2 {

    public static boolean pairSum2(ArrayList<Integer>list,int target){
        //applying two pointer .....
        //first find pivot point
        int lp=0;
        int rp=list.size()-1;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
              lp = i+1;
              rp = i;
              break; 
            }
        }
        int n = list.size();
        while( lp!=rp){
           if(list.get(lp)+list.get(rp)==target){
             return true;
           }
           else if(list.get(lp)+list.get(rp)<target){
             lp = (lp+1)%n;
           }
           else{
              rp = (n+rp-1)%n;
           }
            
        }
        return false;
    }
    public static void main(String[] args) {
        //find if any pair in a sorted & rotated ArrayList has a target sum.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 12;
        System.out.println(pairSum2(list,target));
    }
    
}
