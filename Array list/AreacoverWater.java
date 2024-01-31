import java.util.*;

public class AreacoverWater {
    public static int storeWater(ArrayList<Integer>height){
   
//         //brutforce approach.
//    int maxWater = 0;
//    for(int i = 0 ; i<height.size();  i++){
//     for (int j = i+1; j < height.size(); j++) {
//         int hgt = Math.min(height.get(i),height.get(j));
//         int width = j-i ;
//         int water = hgt*width;     
//         maxWater = Math.max(maxWater,water);
//     }
//    }
//    return maxWater;

//Two pointer approach  O(n)
int lp = 0;
int rp = height.size()-1;
int maxWater = 0; 
while(lp<rp){
    int ht = Math.min(height.get(lp),height.get(rp));
    int width = rp-lp;
    int water = ht*width;
    maxWater = Math.max(maxWater,water);

    //update ptr
    if(height.get(lp)<height.get(rp)){
        lp++;
    }
    else{
        rp--;
    }
 }

return maxWater;
}
public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
   height.add(1);
   height.add(8);
   height.add(6);
   height.add(2);
   height.add(5);
   height.add(4);
   height.add(8);
   height.add(3);
   height.add(7);
   
System.out.println(storeWater(height));   
  
}    
}
