import java.util.*;
import java.util.PriorityQueue;

public class PriorityQ {

static class Student implements Comparable<Student>{
    int rank;
    String name;
    Student(String name,int rank){
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student S2){
        return this.rank - S2.rank;
    }
}
// priorityQueue for objects
public static void main(String[] args) {
 PriorityQueue<Student>pq = new PriorityQueue<>();    
 pq.add(new Student("somdeep",1));
 pq.add(new Student("Anshuman",3));
 pq.add(new Student("Akhilesh",2));
 pq.add(new Student("Hitesh",4));
 pq.add(new Student("deep",5));

 while(!pq.isEmpty()){
    System.out.println("name "+ pq.peek().name + " rank " + pq.peek().rank );
    pq.remove();
 }

}

 /* public static void main(String args[]){
    
    // 1 2 3 4 5 by default ascending order ,give priority to min value. 
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    
    // 5 4 3 2 1 for descending order use comparator
    // PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
    
    // add O(log n)
    pq.add(1);
    pq.add(2);
    pq.add(3);
    pq.add(4);
    pq.add(5);

    while(!pq.isEmpty()){
        System.out.print(pq.peek()+ " "); //O(1)
        pq.remove(); //O(log n)
    }
 }  */
}
