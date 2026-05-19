// LeetCode Problem 110: Balanced Binary Tree

public class Solution110 {
    
    // Node class for the binary tree
    public static class TreeNode {
        // Data members
        int val;
        TreeNode left;
        TreeNode right;

        // Parameterized Constructor
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Class to insert the node in binary tree
    public static class BinaryTree {
        public int index = -1;
        public TreeNode insert(Integer[] values) {
            index++;
            if(index >= values.length || values[index] == null) {
                return null;
            }
            // Create a new node with the current value
            TreeNode newNode = new TreeNode(values[index]);
            // Recursively insert left and right child nodes
            newNode.left = insert(values);
            newNode.right = insert(values);
            return newNode;
        }
    }

    // Function to print the binary tree pre order
    public static void printPreOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    // Function to check the height of the tree and determine if it is balanced
    public static int checkHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight=checkHeight(root.left);
        
        if(leftHeight == -1) {
            return -1;
        }

        int rightHeight=checkHeight(root.right);

        if(rightHeight == -1) {
            return -1;
        }

        if(Math.abs(leftHeight-rightHeight) > 1) {
            return -1;
        }

        int myHeight=Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }

    // Function to determine if the binary tree is balanced
    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    // Main function
    public static void main(String[] args) {
        // Integer[] values = {9,3, 20, null, null, 15, 7};
        Integer[] values = {1,2,2,3,null,null,3,4,null,null,4};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.insert(values);
        System.out.println("Pre-order Traversal of the Binary Tree:");
        printPreOrder(root);
        System.out.println("\nIs the binary tree balanced? " + isBalanced(root));
    }
}

