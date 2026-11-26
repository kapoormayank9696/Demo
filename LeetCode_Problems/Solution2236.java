// LeetCode Problem 2236 : Root Equals Sum of Children
public class Solution2236 {
    
    // TreeNode Class
    public static class TreeNode {
        // Public Access Specifier
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Solution Class
    public static class Solution {
        public int index = -1;

        // Build Tree Function
        public TreeNode buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Root Equals Sum of Children Function
        public boolean checkTree(TreeNode root) {
            return root.val == root.right.val + root.left.val;
        }

        // Display Function
        public void inorder(TreeNode root) {
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nodes = {10, 4, -1, -1, 6, -1, -1};

        TreeNode root = sol.buildTree(nodes);

        System.out.print("Inorder Traversal: ");
        sol.inorder(root);

        System.out.println();
        System.out.println("Root Equals Sum of Children: "+sol.checkTree(root));
    }
}
