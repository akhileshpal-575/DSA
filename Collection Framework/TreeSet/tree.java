import java.util.*;
public class tree {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        // O(log n)
        t.add(2);
        t.add(1);
        t.add(0);
        t.add(34);

        System.out.println(t);

    }
}
