import java.util.ArrayList;
public class BstToBalBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
       }
       // bst to balBst 
       public static void inorder(Node root, ArrayList<Integer>arr){
            if(root == null){
                return;
            }
            inorder(root.left,arr);
            arr.add(root.data);
            inorder(root.right, arr);
       }
       public static Node createBalBst(ArrayList<Integer>arr,int si,int ei){
          if(si>ei){
            return null;
          }
          int mid = si + (ei-si)/2;
          Node root = new Node(arr.get(mid));
          root.left = createBalBst(arr, si,mid-1);
          root.right = createBalBst(arr, mid+1, ei);
          return root;

       }
       public static Node balanceBst(Node root){
        // step 1 create a sorted arr using inorder travesal
        ArrayList<Integer>arr = new ArrayList<>();
        inorder(root,arr);

        //step 2 create a BalBst using sorted list    
        root = createBalBst(arr,0,arr.size()-1);
        return root;
       }
     
       public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
       }
    public static void main(String[] args) {
        // given bst for making balbst by using it.
    /*     8
          / \
         6   10
        /      \
       5        11
      /           \     
     3            12       
     */
 
    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);

    root = balanceBst(root);
    // preorder
    preorder(root);
    }
}
