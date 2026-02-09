// LeetCode Problem 94: Binary Tree Inorder Traversal

import java.util.ArrayList;
import java.util.List;

public class Solution94{
    // Node class
    static class TreeNode{
        // Deafult Access Modifier And Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode(int data){
          this.val=data;
          this.left=null;
          this.right=null;
        }
    }

    // BinaryTree builder
    static class BinaryTree{
        int index=-1;
        public TreeNode buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            TreeNode newNode=new TreeNode(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // Method to give back inorder traversal elements of binary tree
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        traverseInorder(root,list);
        return list;
    }  
    
    // Method to traverse in form of Inorder
    public static void traverseInorder(TreeNode root,List<Integer> result){
        if(root == null){
            return;
        }
        traverseInorder(root.left,result);
        result.add(root.val);
        traverseInorder(root.right,result);
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        TreeNode root=tree.buildTree(nodes);
        System.out.println("Root value of Binary Tree(BT): "+root.val);
        System.out.print("InOrder Traversal: "+inorderTraversal(root));
    }    
}   
