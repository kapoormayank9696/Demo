// LeetCode Problem 2331 : Evaluate Boolean Binary Tree
public class Solution2331 {
    
    // TreeNode class
    public static class TreeNode {

        // Data Members
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

    // Solution class
    public static class Solution {
        public boolean evaluateTree(TreeNode root) {
            if(root.left == null || root.right == null) {
                return root.val == 1;
            }

            boolean left = evaluateTree(root.left);
            boolean right = evaluateTree(root.right);

            // Or Operation
            if(root.val == 2) {
                return left || right ;
            }

            // And Operation
            return left && right;
        }
    }

    // Main function
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);

        // Creating Solution Object
        Solution sol = new Solution();

        // Evaluate Boolean Binary Tree
        boolean result = sol.evaluateTree(root);

        System.out.println("Evaluation Result: " + result);
    }
}
