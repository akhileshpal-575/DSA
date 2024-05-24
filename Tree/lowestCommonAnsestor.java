import java.util.*;
import java.util.ArrayList;
public class lowestCommonAnsestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root , int n , ArrayList<Node>path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if(foundleft||foundright){
            return true;
        }
        path.remove(path.size()-1);      

        return false;
    }
     
    // Approach 1
    public static void lca(Node root, int n1, int n2){
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node>path2 = new ArrayList<>();
    getPath(root,n1,path1);   
    getPath(root,n2,path2);    
     int i  = 0;
    for(;i<path1.size() && i<path2.size(); i++){
        if(path1.get(i)!=path2.get(i)){
            break;
        }
    }
    System.out.println(path1.get(i-1).data);
 }

    // Approach 2
    public static Node lca2(Node root , int n1, int n2){
        if(root == null || root.data == n1 || root.data== n2){
            return root;
        }
        Node leftlca = lca2(root.left,n1,n2);
        Node rightlca = lca2(root.right,n1,n2);

        if(leftlca==null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }
public static void main(String[] args) {
    /*         1
              / \
             2   3
            / \    \
           4   5    6 
     
     */
           Node root = new Node(1);
           root.left = new Node(2);
           root.right = new Node(3);
           root.left.left = new Node(4);
           root.left.right = new Node(5);
           root.right.right = new Node(6);

        lca(root, 4, 6);
        System.out.println(" lca : "+ lca2(root,4,6).data);
    }

}
