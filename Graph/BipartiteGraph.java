import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
public class BipartiteGraph {
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
    //   0 - vertex
    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2, 1));

    //  1-vertex
    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 3, 1));

    graph[2].add(new Edge(2, 0, 1));
    graph[2].add(new Edge(2, 4, 1));

    // vertex -3
    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 4, 1));

    // vertex - 4
    graph[4].add(new Edge(4, 2, 1));
    graph[4].add(new Edge(4, 3, 1));

}
// public static boolean cycleDetect(ArrayList<Edge>[]graph){
//     boolean visit[] = new boolean[graph.length];

//     for(int i = 0; i<graph.length; i++){
//         if(!visit[i]){
//             if(cycleDetectUtil(graph,i,-1,visit)){
//                 return true;
//             }
//         }
//     }
//     return false;
// }
// public static boolean cycleDetectUtil(ArrayList<Edge>[]graph,int curr,int par,boolean[] visit){
//     visit[curr] = true;

//     for(int i =0; i<graph[curr].size();i++){
//         Edge e = graph[curr].get(i);
//         // case 3
//         if(!visit[e.dest]){
//             if(cycleDetectUtil(graph,e.dest,curr, visit)){
//                 return true;
//             }
//         }
//         // case 1
//         else if(visit[e.dest]&&curr!=par){
//             return true;
//         }
//         // case 2 do nothing
//     }
//     return false;
// }
    public static boolean isBipartite(ArrayList<Edge>[]graph){
        int []clr = new int[graph.length];
        for(int i = 0; i<clr.length; i++){
            clr[i] = -1;
        }

        Queue<Integer>q= new LinkedList<>();
        for(int i =0; i<graph.length; i++){
            if(clr[i] == -1){
                clr[i] = 0;
                q.add(i);
            while(!q.isEmpty()){
                int curr = q.remove();
                for(int j =0; j<graph[curr].size();j++){
                    Edge e = graph[curr].get(j);

                    // case 1
                    if(clr[e.dest]==-1){
                        int nextclr = clr[curr] == 0?1:0;
                        clr[e.dest] = nextclr;
                        q.add(e.dest);
                    }
                    // case 2
                    else if(clr[e.dest] == clr[curr]){
                        return false;
                    }
                }
            }
        }  
    }
        return true;
    }
    public static void main(String[] args) {
        //        1 - 3 
        //      /     |  
        //    0       |  
        //      \     |  
        //       2 -- 4 
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
