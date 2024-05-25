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
    // min distace between nodes
    public static int dist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = dist(root.left, n);
        int right = dist(root.right,n);

        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right+1;
        }else{
            return left+1;
        }
    }
    public static void minDistance(Node root ,int n1,int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = dist(lca,n1);
        int dist2 = dist(lca,n2);

        System.out.println("min distance is :"+ (dist1+dist2));
    } 
    // Kth ancestor of node
    public static int kthAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = kthAncestor(root.left, n, k);
        int rightdist = kthAncestor(root.right, n, k);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        int max = Math.max(leftdist,rightdist);
        if(max+1 == k){
            System.out.println("kth Ancestor is "+ root.data);
        }
        return max+1;
    }
    // transform to sum tree
    public static int transformSumTree(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = transformSumTree(root.left);
        int rightchild = transformSumTree(root.right);

        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null? 0 : root.right.data;

        root.data = newleft + leftchild +newright + rightchild;

        return data;
    }
    // new transform tree 
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
public static void main(String[] args) {
    /*         1
              / \
             2   3
            / \   \
           4   5    6 
     
     */
           Node root = new Node(1);
           root.left = new Node(2);
           root.right = new Node(3);
           root.left.left = new Node(4);
           root.left.right = new Node(5);
           root.right.left = new Node(6);
           root.right.right = new Node(7);

        lca(root, 4, 6);
        System.out.println(" lca : "+ lca2(root,4,6).data);

        minDistance(root, 4, 6);
        kthAncestor(root, 5, 1);
        System.out.println();
        
        transformSumTree(root);
        preorder(root);
    }

}
