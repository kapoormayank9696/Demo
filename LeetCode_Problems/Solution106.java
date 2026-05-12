// LeetCode Problem 106: Construct Binary Tree from Inorder and Postorder Traversal

import java.util.HashMap;
import java.util.Map;
public class Solution106 {
    // Class Of TreeNode
    @SuppressWarnings("unused")
    public static class TreeNode {
        // Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    // Class To Build Tree
    public static class BinaryTree {
        public int index=-1;
        public int postIndex=-1;
        public Map<Integer, Integer> map=new HashMap<>(); 
        public TreeNode buildTree(int[] nodes) {
            index++;
            if(index > nodes.length || nodes[index] == -1) {
                return null;
            }
            TreeNode root=new TreeNode(nodes[index]);
            root.left=buildTree(nodes);
            root.right=buildTree(nodes);
            return root;
        }

        // Function To Build Tree From Inorder And Postorder Traversal
        public TreeNode BuildTree(int[] inorder, int[] postorder) {
            for(int i=0;i<inorder.length;i++) {
                map.put(inorder[i], i);
            }
            postIndex = postorder.length - 1;
            TreeNode root=BuildTrees(postorder,0,postorder.length-1);
            return root;
        }

        // Function To Build Tree From Inorder And Postorder Traversal
        public TreeNode BuildTrees(int[] postorder, int start, int end) {
            if(start > end) {
                return null;
            }
            int val=postorder[postIndex];
            TreeNode root=new TreeNode(val);
            int inorderIndex=map.get(val);
            postIndex--;
            root.right=BuildTrees(postorder, inorderIndex+1, end);
            root.left=BuildTrees(postorder, start, inorderIndex-1);
            return root;
        }
    }

    // Function To Print Tree
    public static void printTree(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        TreeNode root=tree.buildTree(nodes);
        System.out.print("Preorder Traversal: ");
        printTree(root);
        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};
        TreeNode root2=tree.BuildTree(inorder, postorder);
        System.out.print("\nPreorder Traversal: ");
        printTree(root2);
    }
}
