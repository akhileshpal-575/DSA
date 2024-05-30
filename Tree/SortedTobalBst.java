public class SortedTobalBst {
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
   //sorted array to balanced Bst    
   public static Node createBalBst(int arr[],int si , int ei){
    if(si>ei){
        return null;
    }
    int mid = si + (ei-si)/2;
    Node root = new Node(arr[mid]);
    root.left = createBalBst(arr, si , mid-1);
    root.right = createBalBst(arr, mid+1 ,ei);

    return root;
   }
     //preorder traversal 
   public static void preorder(Node root){
    if(root == null){
        return ;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
   }
public static void main(String[] args) {
    // sorted arr 
    int arr[] = {3,5,6,8,10,11,12};
    Node root = createBalBst(arr, 0, arr.length-1);
    // preorder to verify balBst
    preorder(root);   //correct balbst ..

}
}
