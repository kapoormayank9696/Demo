// Find Bottom Left Tree Value Algorithm Implementation In Java
public class FindBottomLeftTreeValue {

    // Node class of Binary Tree (BT)
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    // Solution Class
    public static class Solution {
        int maxHeight = -1;
        int result = 0;
        int index = -1;

        // Function to build Binary Tree
        TreeNode buildTree(int[] nodes, int k) {
            index++;

            if (index >= k || nodes[index] == -1) {
                return null;
            }

            // Creating New Node
            TreeNode newNode = new TreeNode(nodes[index]);

            // Recursive calls for left and right children
            newNode.left = buildTree(nodes, k);
            newNode.right = buildTree(nodes, k);

            return newNode;
        }

        // PreOrder Method to find bottom-left value
        void preOrder(TreeNode root, int height) {
            if (root == null) {
                return;
            }

            if (height > maxHeight) {
                maxHeight = height;
                result = root.val;
            }

            preOrder(root.left, height + 1);
            preOrder(root.right, height + 1);
        }

        // Find Bottom Left Value Function
        int findBottomLeftValue(TreeNode root) {
            maxHeight = -1;
            result = 0;

            preOrder(root, 0);
            return result;
        }

        // Function to perform PreOrder Traversal
        void preOrder(TreeNode root) {
            if (root == null) {
                return;
            }

            System.out.print(root.val + " ");

            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Main Class
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Preorder representation: -1 means null
        int[] nodes = {
            10,
            5, 3, -1, -1, 7, -1, -1,
            15, 12, -1, -1, 18, -1, -1
        };

        int k = nodes.length;

        TreeNode root = sol.buildTree(nodes, k);

        System.out.print("PreOrder Traversal of the Binary Tree: ");
        sol.preOrder(root);

        System.out.println(
            "\nBottom Left Value Of Binary Tree: "
            + sol.findBottomLeftValue(root)
        );
    }
}
