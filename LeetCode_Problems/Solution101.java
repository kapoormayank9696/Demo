// LeetCode Problem 101: Symmetry Tree
public class Solution101 {

    // Node class of Binary Tree
    @SuppressWarnings("unused")
    public static class TreeNode {
        // Data Memebers
        int val;
        TreeNode left;
        TreeNode right;
        
        // Parameterized Constructor
        public TreeNode(int val) {
            this.val=val;
            this.left=null;
            this.right=null;
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

        // Function to check binary tree is mirror of itself
        public boolean isMirror(TreeNode t1,TreeNode t2) {
            if(t1 == null && t2 == null) return true;
            if(t1 == null || t2 == null) return false;
            if(t1.val != t2.val) return false;
            return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
        }

        // Function to check if the binary tree is symmetric
        public boolean isSymmetry(TreeNode root) {
            if(root == null) {
                return true;
            }
            return isMirror(root.left,root.right);
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

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1};
        TreeNode root = tree.insert(arr);
        System.out.print("Print the Binary Tree : ");
        printPreOrder(root);
        System.out.print("\nThe Binary Tree Is Symmetry : "+tree.isSymmetry(root));
    }
}

