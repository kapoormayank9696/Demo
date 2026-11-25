// LeetCode Problem 671 : Second Minimum Node In a Binary Tree
public class Solution671 {
    
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

        // Function to find second minimum value
        public int findSecondMinimumValue(TreeNode root) {
            if(root.left == null) return -1;
        
            int l = (root.left.val == root.val) ? findSecondMinimumValue(root.left) : root.left.val;
            int r = (root.right.val == root.val) ? findSecondMinimumValue(root.right) : root.right.val;
            
            return l == -1 || r == -1 ? Math.max(l,r) : Math.min(l,r);
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
        int[] nodes = {2, 2, -1, -1, 5, 5, -1, -1, 7, -1, -1};

        TreeNode root = sol.buildTree(nodes);

        System.out.print("Inorder Traversal: ");
        sol.inorder(root);

        System.out.println();
        System.out.println("Second Minimum Value: " + sol.findSecondMinimumValue(root));
    }
}
