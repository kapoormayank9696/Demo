// LeetCode Problems 700 : Search in a Binary Search Tree
public class Solution700 {
    
    // Class Of BST TreeNode
    public static class TreeNode {

        // Public Specificer And Data Members
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Solution Class
    public static class Solution {

        // Create BST
        public TreeNode insert(TreeNode root, int val) {
            if(root == null) {
                return new TreeNode(val);
            }

            // Compare and use Recursive Function
            if(val < root.val) {
                root.left = insert(root.left, val);
            }

            else if(root.val < val) {
                root.right = insert(root.right, val);
            }

            return root;
        }

        // Search In BST
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }

            // Compare and use Recursive Function
            if(root.val == val) {
                return root;
            }

            if(val < root.val) {
                return searchBST(root.left,val);
            }
        
            return searchBST(root.right,val);
        }

        // Print BST
        public void print(TreeNode root) { 
            if(root == null) {
                return;
            }

            System.out.print(root.val+"-->");

            // Recursive Calls Function
            print(root.left);
            print(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Integer[] values = {1,2,2,3,null,null,3,4,null,null,4};
        TreeNode root = null;
        Solution solution = new Solution();
        
        for (Integer val : values) {
            if (val != null) {
                root = solution.insert(root, val);
            }
        }
        System.out.println("Pre-order Traversal of the Binary Tree:");
        solution.print(root);

        int val = 2;
        TreeNode result = solution.searchBST(root, val);

        if(result != null) {
            System.out.println("Search in binary tree: " + result.val);
        } else {
            System.out.println("Value not found");
        }
    }
}

