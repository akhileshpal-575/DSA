import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(54);

        int maxE = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            maxE = Math.max(maxE,list.get(i));
        }
        System.out.println(maxE);
    }
    
}
