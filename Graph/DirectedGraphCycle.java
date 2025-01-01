import java.util.*;
import java.util.ArrayList;

public class DirectedGraphCycle {

    static class Edge{
        int src ;
        int dest;
        int wt;
       Edge(int src,int dest,int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
       }
    }
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // // graph 1:
        // graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));
        // graph[1].add(new Edge(1, 3, 0));
        // graph[2].add(new Edge(2, 3, 1));
    
        // graph 2:
        graph[0].add(new Edge(0, 2, 0));
        graph[1].add(new Edge(1, 0, 0));
        graph[2].add(new Edge(2, 3, 0));
        graph[3].add(new Edge(3, 0, 1));
    
    }
    public static boolean cycleDetect(ArrayList<Edge>[]graph){
        boolean visit[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0; i<graph.length; i++){
            if(!visit[i]){
                if(cycleDetectUtil(graph,i,stack,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean cycleDetectUtil(ArrayList<Edge>[]graph,int curr,boolean[] stack,boolean[] visit){
        visit[curr] = true;
        stack[curr] = true;    
        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
            return true;
            }
            else if(!visit[e.dest]&&cycleDetectUtil(graph,e.dest,stack, visit)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
    //   1---> 0  --->  2
    //         ^       | 
    //         |       |
    //         |       |
    //         |       v
    //         --------3
     int v = 4;
     ArrayList<Edge>graph[] = new ArrayList[v];
     createGraph(graph);
     System.out.println(cycleDetect(graph));
    }
}
