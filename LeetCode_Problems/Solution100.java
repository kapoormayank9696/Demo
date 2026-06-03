// Leetcode Problem 100: Same Tree

public class Solution100 {
    
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
        public TreeNode insert(int[] values) {
            index++;
            if(index >= values.length || values[index] == -1) {
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

    // Function to check if two binary trees are the same
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Print the binary tree pre order
    public static void printPreOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] values1 = {1, 2, 3};
        int[] values2 = {1, 2, 3};
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        TreeNode root1 = tree1.insert(values1);
        TreeNode root2 = tree2.insert(values2);
        System.out.println("Pre-order Traversal of Tree 1:");
        printPreOrder(root1);
        System.out.println("\nPre-order Traversal of Tree 2:");
        printPreOrder(root2);
        System.out.println("\nAre the two trees the same? " + isSameTree(root1, root2));
    }
}
