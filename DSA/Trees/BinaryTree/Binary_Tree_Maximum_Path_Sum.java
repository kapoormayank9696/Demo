// Binary Tree Maximum Path Sum Algorithm Implement in a Java

public class Binary_Tree_Maximum_Path_Sum {

    // TreeNode Class
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree Class
    public static class BinaryTree {
        public int index = -1;

        // Function to build the binary tree from an array
        public TreeNode buildTree(int[] nodes,int key) {
            index++;
            if(index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[index]);
            newNode.left = buildTree(nodes, key);
            newNode.right = buildTree(nodes, key);
            return newNode;
        }

        public int maxSum = Integer.MIN_VALUE;

        // Function to find the maximum path sum
        public int maxPathSum(TreeNode root) {
            dfs(root);
            return maxSum;
        }

        // Depth-First Search to calculate maximum path sum
        public int dfs(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int leftSum = Math.max(dfs(node.left), 0);
            int rightSum = Math.max(dfs(node.right), 0);

            int currentSum = node.val + leftSum + rightSum;
            maxSum = Math.max(maxSum, currentSum);

            return node.val + Math.max(leftSum, rightSum);
        }
    }

    // Main function
    public static void main(String[] args) {
        
        // Example input for the binary tree
        int[] nodes = {-10, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        
        TreeNode root = tree.buildTree(nodes, 0);
        int maxPathSum = tree.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);
    }
}
