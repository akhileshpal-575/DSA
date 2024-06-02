import java.util.*;
public class Majority {
  public static void main(String[] args) {
    int nums[] ={1,3,2,5,1,3,1,5,1};
    // print elements which came more than n/3
    HashMap<Integer,Integer> map = new HashMap<>();

    // for (int i : nums) {
        // if(map.containsKey(i)){
        //     map.put(i,map.get(i)+1);
        // }
        // else{
        //     map.put(i,1);
        // }
    // }
    for(int i = 0; i<nums.length; i++){
        map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
    }

    for(Integer key : map.keySet()){
        if(map.get(key) >= nums.length/3){
            System.out.print(key+" ");
        }
    }

  }    
}
