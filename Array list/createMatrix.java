import java.util.*;
public class createMatrix {

 public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
     
    ArrayList<Integer>list1 = new ArrayList<>();
    ArrayList<Integer>list2 = new ArrayList<>();
    ArrayList<Integer>list3 = new ArrayList<>();
    
    for(int i = 1; i<=5; i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);

    // System.out.println(mainList);

    //print matrix using loop
    for(int i = 0; i<mainList.size(); i++){
     ArrayList<Integer>curr = mainList.get(i);
     System.out.print(curr);   //also we can use loop here 
     System.out.println();
    }
 }    
}