
import java.util.ArrayList;

public class MergeTwoBst {
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
    public static void inorder(Node root,ArrayList<Integer>arr){
        if(root == null){
            return ;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static Node createBst(ArrayList<Integer>arr,int si ,int ei){
        if(si>ei){
          return null;            
        }
        int mid = (si + ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr,si,mid-1);
        root.right = createBst(arr,mid+1,ei);
        return root;
    }
    public static Node mergeBst(Node root1,Node root2){
        // step1
        ArrayList<Integer>arr1 = new ArrayList<>();
        inorder(root1,arr1);
        // step 2
        ArrayList<Integer>arr2 = new ArrayList<>();
        inorder(root2,arr2);

        // merge 
        int i= 0;
        int j = 0;
        ArrayList<Integer>finalarr = new ArrayList<>();
 
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            } 
        }
         while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
         }
          while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
          }
          return createBst(finalarr,0,finalarr.size()-1);
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
        // bst 1
        /* 2
          / \
         1   4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // bst 2
        /* 9
          / \
         3   12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        
        Node root = mergeBst(root1, root2);
        preorder(root);
    }
}
