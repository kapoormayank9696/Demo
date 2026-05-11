// 
// PreOrder To InOrder Make Tree Algorithm Implementation In Java

import java.util.HashMap;

public class Solution105 {
    // Class Of Binary Tree
    @SuppressWarnings("unused")
    public static class TreeNode{
        // Data Memebers
        int data;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree {
        HashMap<Integer,Integer> map=new HashMap<>();
        public int preorderIndex=0;
        public int index=-1;
        public TreeNode buildTree(int[] nodes) {
            index++;
            if(nodes.length <= index || nodes[index] == -1) {
                return null;
            }
            TreeNode newNode=new TreeNode(nodes[index]);
            // Left Side Tree Build
            newNode.left=buildTree(nodes);
            // Right Side Tree Build
            newNode.right=buildTree(nodes);
            return newNode;
        }

        // Function to return the root from selecting the root inOrder
        public TreeNode BuildTree(int[] inorder,int[] preOrder) {
            for(int i=0;i<inorder.length;i++) {
                map.put(inorder[i], i);
            }
            TreeNode root=build(preOrder,0,inorder.length-1);
            return root;
        }

        // Function to build the tree from inorder to preorder
        public TreeNode build(int[] preOrder,int left,int right) {
            if(left > right) {
                return null;
            }
            int rootValue=preOrder[preorderIndex++];
            TreeNode root=new TreeNode(rootValue);
            int inorderIndex=map.get(rootValue);
            root.left=build(preOrder,left,inorderIndex-1);
            root.right=build(preOrder,inorderIndex+1,right);
            return root;
        }
    }
    

    // Method to print the values in form of pre order traversal
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    // Main Function
    public static void main(String[] args) {
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree= new BinaryTree();
        TreeNode sampleRoot=tree.buildTree(nodes);
        System.out.print("Origianl Binary Tree: ");
        preOrder(sampleRoot);
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root=tree.BuildTree(inorder, preorder);
        System.out.print("\nAfter Convert InOrder To PreOrder: ");
        preOrder(root);
    }
}


