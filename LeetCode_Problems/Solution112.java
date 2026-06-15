// Leetcode Problem 112: Path Sum

public class Solution112 {

    // Class Of Binary Tree Node
    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        // Parameterized Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Function to build binary tree
    public static class BinaryTree {

        public int index = -1;

        public TreeNode buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[index]);
            // Recursive Calls
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Function to check the path sum
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            // Check if it's a leaf node and the path sum equals targetSum
            if (root.left == null && root.right == null) {
                return root.val == targetSum;
            }
            // Recursive calls for left and right subtrees
            int remainingSum = targetSum - root.val;
            return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
        }

        // Function to print the Binary Tree
        public void display(TreeNode root) {
            if (root != null) {
                System.out.print(root.val + " ");
                display(root.left);
                display(root.right);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {5, 4, 11, 7, -1, -1, 2, -1, -1, -1, 8, 13, -1, -1, 4, -1, 1, -1, -1};
        TreeNode root = tree.buildTree(nodes);
        System.out.println("Binary Tree:");
        tree.display(root);
        System.out.println();
        System.out.println("Has Path Sum (22): " + tree.hasPathSum(root, 22));
    }

}
