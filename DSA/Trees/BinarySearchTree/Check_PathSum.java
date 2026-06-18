// Check Path Sum Algorithm Implementation In Java

public class Check_PathSum {

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
    public static class BinarySearchTree {

        public TreeNode buildTree(TreeNode root, int val) {
            if (root == null) {
                root = new TreeNode(val);
                return root;
            }
            if (val < root.val) {
                root.left = buildTree(root.left, val);
            } else {
                root.right = buildTree(root.right, val);
            }
            return root;
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
        
        BinarySearchTree tree = new BinarySearchTree();
        int[] nodes = {5, 4, 11, 7, 2, 8, 13, 4, 1};
        TreeNode root = null;
        for (int val : nodes) {
            root = tree.buildTree(root, val);
        }
        System.out.println("Binary Tree:");
        tree.display(root);
        System.out.println();
        System.out.println("Has Path Sum (22): " + tree.hasPathSum(root, 22));
    }

}
