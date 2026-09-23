// Sum Root to Leaf Numbers Algorithm Implement In Java
public class Solution129 {

    // TreeNode Class
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    // BinaryTree Class
    public static class BinaryTree {
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

        // Sum Root to Leaf Numbers Function
        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }

        // DFS Helper Function
        public int dfs(TreeNode node, int sum) {
            if (node == null) {
                return 0;
            }

            sum = sum * 10 + node.val;

            // If it's a leaf node, return the current sum
            if (node.left == null && node.right == null) {
                return sum;
            }

            // Recur for left and right subtrees
            return dfs(node.left, sum) + dfs(node.right, sum);
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] nodes = {1, 2, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);

        System.out.print("Binary Tree print: ");
        for (int i = 0; i < nodes.length; i++) {
            System.out.print(nodes[i] + "-->");
        }
        System.out.println("null");

        int result = tree.sumNumbers(root);
        System.out.println("Sum of Root to Leaf Numbers: " + result);
    }
}
