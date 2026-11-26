// LeetCode Problem 814 : Binary Tree Pruning
public class Solution814 {
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

        // Binary Tree Pruning
        public TreeNode pruneTree(TreeNode root) {
            if(root == null) return null;
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            
            if(root.left == null && root.right == null && root.val == 0) {
                return null;
            }
            return root;
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
        int[] nodes = {1, -1, 0, 0, -1, -1, 1, -1, -1};

        TreeNode root = sol.buildTree(nodes);

        System.out.print("Before Pruning: ");
        sol.inorder(root);
        System.out.print("\n");
        
        root = sol.pruneTree(root);
        System.out.print("After Pruning: ");
        sol.inorder(root);
        System.out.print("\n");
    }
}
