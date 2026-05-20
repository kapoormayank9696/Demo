// LeetCode Problem 543: Diameter of Binary Tree

public class Solution543 {

    @SuppressWarnings("unused")
    // Node class for the binary tree
    public static class TreeNode {
        // Data members
        int val;
        TreeNode left;
        TreeNode right;

        // Parameterized constructor
        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Class variable to store the diameter of the binary tree
    public static class Solution {
        public int index = -1;
        // Function to insert the node in the binary tree
        public TreeNode insert(int[] val) {
            index++;
            if(index >= val.length || val[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(val[index]);
            newNode.left = insert(val);
            newNode.right = insert(val);
            return newNode;
        }

        public int diameter = 0;
        // Function to calculate the height of the binary tree and update the diameter
        public int height(TreeNode root) {
            if(root == null) {
                return 0;
            }
            // Recursively calculate the height of left and right subtrees and update the diameter
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            diameter = Math.max(diameter, leftHeight + rightHeight);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Function to calculate the diameter of the binary tree
        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return diameter;
        }
    }

    // Function to print the binary tree print
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        Solution solution = new Solution();
        TreeNode root = solution.insert(nodes);
        System.out.println("Binary Tree:");
        print(root);
        int diameter = solution.diameterOfBinaryTree(root);
        System.out.println("\nDiameter of the Binary Tree: " + diameter);
    }
}
