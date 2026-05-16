// LeetCode Problem 98: Validate Binary Search Tree
public class Solution98 {

    // Node class of Binary Search Tree
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

    // Function to insert a nodes of BST
    public static TreeNode insert(TreeNode root,int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        // Recursive function
        if(root.val > val) {
            // Left Subtree
            root.left=insert(root.left,val);
        }
        if(root.val < val){
            // Right Subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    // Function to print the BST tree
    public static void print(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        // Recursive Function
        print(root.left); // Left Subtree
        print(root.right); // Right Subtree
    }

    // Function to check if the given binary tree is a valid Binary Search Tree (BST)
    public static boolean checkBST(TreeNode root,long min,long max) {
        if(root == null) {
            return true;
        }
        if(root.val <= min || max <= root.val) {
            return false;
        }
        return checkBST(root.left,min,root.val) && 
        checkBST(root.right,root.val,max);
    }

    // Main function to validate the binary search tree
    public static boolean isValidBST(TreeNode root) {
        return checkBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    // Main function
    public static void main(String[] args) {
        int[] values = { 5, 3, 6, 2, 4, 7 };
        TreeNode root=null;
        for(int num:values){
            root=insert(root, num);
        }
        System.out.print("Print BST : ");
        print(root);
        System.out.println("\nIs the given binary tree a valid Binary Search Tree (BST)? "+isValidBST(root));
    }
}

