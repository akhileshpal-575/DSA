import java.util.*;
import java.util.LinkedList;
public class BinaryTreesTraversal{
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
    static class BinaryTree{
        static int idx =-1;
        // build tree
        public static Node buildTree(int nodes[]){
               idx++;
               if(nodes[idx] ==-1){
                return null;
               }
               Node newNode = new Node(nodes[idx]);               
               newNode.left = buildTree(nodes);
               newNode.right = buildTree(nodes);

               return newNode;
            }

            // preorder traversal
        public static void preorderTraversal(Node root){
          if(root== null){
            return;
           }  
          System.out.print(root.data + " ");
          preorderTraversal(root.left);
          preorderTraversal(root.right);     
        }
        // inorder traversal
        public static void inorderTraversal(Node root){
            if(root == null){
                return;
            }   
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
        //postorder traversal 
        public static void postorderTraversal(Node root){
            if(root == null){
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
        // levelorder traversal
        public static void levelorderTraversal(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
             q.add(root);
             q.add(null);

             while(!q.isEmpty()){
                Node currentNode = q.remove();
                if(currentNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left!=null){
                        q.add(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        q.add(currentNode.right);
                    }
                }
             }
        }
        // kth level of tree using level order approach
        // O(N)
        public static void kthLevelTree(Node root,int k){
            if(root == null&&k<1){
                return;
            }
            Queue<Node> q = new LinkedList<>();
             q.add(root);
             int level = 1;
             while(!q.isEmpty()){
                int size = q.size();
                  for(int i = 0; i<size; i++){
                    Node currentNode = q.remove();
                    if(level == k){
                    System.out.print(currentNode.data+" ");
                    }
                    if(currentNode.left!=null){
                        q.add(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        q.add(currentNode.right);
                    }
                }
                level++;
                if(level>k){
                    break;
                }
             }
        }
        // kth level of tree recursive approach best O(n) O(1)
        public static void kthLevelOfTree(Node root, int level , int k){
            if(root == null){
                return ;
            }
            if(level == k){
                System.out.print(root.data + " ");
            }
            kthLevelOfTree(root.left, level+1, k);
            kthLevelOfTree(root.right, level+1, k);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
    
        // System.out.println(root.data);

        System.out.println("preorderTraversal of tree:");
        tree.preorderTraversal(root);
        
        System.out.println();

        System.out.println("inorderTraversal of tree:");       
        tree.inorderTraversal(root);

        System.out.println();
       
        System.out.println("postorderTraversal of tree");
        tree.postorderTraversal(root);

        System.out.println();
        
        System.out.println("level order traversal ");
        tree.levelorderTraversal(root);
    
        System.out.println();
        System.out.println("Kthlevel tree using level order traversal ");
        tree.kthLevelTree(root,3);
    
        System.out.println();
        System.out.println("Kthlevel of tree recursive approach ");
        tree.kthLevelOfTree(root,1,3);
    
    }
}
