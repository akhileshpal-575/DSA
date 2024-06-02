import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr1[] = {6,3,9,2,9,4};

        HashSet<Integer>s = new HashSet<>();

        for(int i:arr){
            s.add(i);
        }
        for(int i : arr1){
            s.add(i);
        }
        // printing union of two
        for (Object e : s) {
         System.out.print(e + " ");   
        }
        // set clear
        s.clear();
        // find intersection
        for(int i = 0; i<arr.length; i++){
            s.add(arr[i]);
        }
        System.out.println("intersection:");
        for(int i = 0; i<arr1.length; i++){
            if(s.contains(arr1[i])){
                System.out.print(arr1[i] + " ");
                s.remove(arr1[i]);
            }
        }
    }
}
