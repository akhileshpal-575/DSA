import java.util.*;
import java.util.ArrayList;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;     
        }
    }
    // build Binary search tree.
        public static Node insert(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }
            if(root.data<val){
                root.right = insert(root.right,val);
            }
            else{
                root.left = insert(root.left,val);
            }
            return root;
        }
        public static void inorder(Node root){
            if(root == null){
                return ;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    
        // searching in BST
        public static boolean search(Node root , int val){
            if(root == null){
                return false;
            }
            if(root.data == val){
                return true;
            }
            if(root.data > val){
                return search(root.left, val);
            }else{
               return search(root.right,val);
            }
        }
        // delete node from the tree
        public static Node delete(Node root, int val){
            if(root.data<val){
              root.right = delete(root.right,val);
            }else if(root.data>val){
                root.left = delete(root.left,val);
            }else{
                // case 1 leaf node
                if(root.left ==null && root.right == null){
                    return null;
                }
                // case 2 one child
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }
                // case 3 two children
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right,IS.data);
            }
            return root;
        }
        public static Node findInorderSuccessor(Node root){
            while(root.left!=null){
                root = root.left;
            }
            return root;
        }
        // print in range
        public static void printInRange(Node root,int k1,int k2){
            if(root == null){
                return ;
            }
            if(root.data>=k1 && root.data<=k2){
             printInRange(root.left, k1, k2);   
             System.out.print(root.data+" ");
             printInRange(root.right, k1, k2);   
            }
            else if(root.data<k1&&root.data<k2){
                printInRange(root.right, k1, k2);
            }else{
                printInRange(root.left, k1, k2);
            }
        }
        // paths from Root to leaf Node
        public static void printPath(ArrayList<Integer>path){
            for (int i = 0; i < path.size(); i++) {
                System.out.println(path.get(i)+ " ");
            }
        }
        public static void rootToLeaf(Node root,ArrayList<Integer>path){
            if(root == null){
                return ;
            }
            path.add(root.data);
            if(root.left == null && root.right == null){
                printPath(path);
            }
            rootToLeaf(root.left,path);
            rootToLeaf(root.right, path);
            path.remove(path.size()-1);
        }
        // validate BST
        public static boolean validateBST(Node root,Node min ,Node max){
            if(root == null){
                return true;
            }
            if(min!=null && root.data<=min.data){
                return false;
            }           
            if(max!=null&& root.data>=max.data){
                return false;
            }
            return validateBST(root.left,min,root)&&validateBST(root.right,root,max);
        }

        // Mirror a BST
        public static Node mirrorBst(Node root){
            if(root == null){
                return null;
            }
           Node leftsub = mirrorBst(root.left);
           Node rightsub = mirrorBst(root.right);

            root.left = rightsub;
            root.right = leftsub;
            return root;
        }
    
    public static void main(String[] args) {
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        // System.out.println();
        // inorder(root); //give a sorted sequence for BST.

        // System.out.println();
        // if(search(root, 2)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("Not found");
        // }
        // root = delete(root,3);
        // System.out.println();
        // inorder(root);
        // printInRange(root, 10, 20);

        // ArrayList<Integer>path = new ArrayList<>();
        // rootToLeaf(root,path);

        // if(validateBST(root,null,null)){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }

    }
}

