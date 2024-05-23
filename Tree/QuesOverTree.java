import java.util.*;
public class QuesOverTree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data  =  data;
            this.left = null;
            this.right = null;
        }
    }
    // height of tree
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh,rh)+ 1;
    }
    // Count nodes in tree
    public static int countNodes(Node root){
        if(root == null)
        return 0;
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc+rc+1;
    }
    // sum of nodes in tree
    public static int sumNodes(Node root){
        if(root == null)
        return 0;

        int ls = sumNodes(root.left);
        int rs = sumNodes(root.right);
        return ls + rs + root.data;
    } 

    // diameter of tree in O(n^2)
    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int leftdiam = diameter1(root.left);
        int lh = Height(root.left);
        int rightdiam = diameter1(root.right);
        int rh = Height(root.right); 
        int selfdiam = lh + rh +1;
        return Math.max(Math.max(leftdiam,rightdiam),selfdiam);
    }
     static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
     }
    //  diameter of tree in O(n)
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info infoleft = diameter(root.left);
        Info inforight = diameter(root.right);
        int fdiam = Math.max(Math.max(infoleft.diam,inforight.diam),infoleft.ht+inforight.ht+1);
        int fheight = Math.max(infoleft.ht,inforight.ht )+ 1;
        return new Info(fdiam,fheight);
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
           
           System.out.println("Height : "+ Height(root));

           System.out.println("countNodes : "+ countNodes(root));

           System.out.println("sumNodes : "+ sumNodes(root));
           
           System.out.println("diameter1 : "+ diameter1(root));
           
           System.out.println("diameter : "+ diameter(root).diam);
 }   
}