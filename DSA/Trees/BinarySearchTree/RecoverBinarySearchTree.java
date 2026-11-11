// Recover Binary Search Tree Algorithm Implementation in Java
public class RecoverBinarySearchTree {

    // Binary Tree Node class
    public static class TreeNode {
        // Public Access Modifiers for TreeNode class
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
        public TreeNode first;
        public TreeNode second;
        public TreeNode prev;

        // Insert Operation for Binary Search Tree
        public TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if (val < root.val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }

        // Recover Tree Function to fix the swapped nodes in the BST
        public void recoverTree(TreeNode root) {
            first = null;
            second = null;
            prev = null;
            
            helper(root);
            if (first != null && second != null) {
                int temp = first.val;
                first.val = second.val;
                second.val = temp;
            }
        }

        // Helper function to perform in-order traversal and detect swapped nodes
        void helper(TreeNode node) {
            if (node == null) return;

            // Traverse left subtree
            helper(node.left);

            // Detect swapped nodes
            if (prev != null && prev.val > node.val) {
                if (first == null) {
                    first = prev;
                }
                second = node;
            }
            prev = node;

            // Traverse right subtree
            helper(node.right);
        }

        // Display the tree in-order (for testing purposes)
        public void inorder(TreeNode root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.val + " ");
                inorder(root.right);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a binary search tree with swapped nodes
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.print("In-order traversal of the original tree: ");
        solution.inorder(root);
        System.out.println();

        // Recover the binary search tree
        solution.recoverTree(root);

        System.out.print("In-order traversal of the recovered tree: ");
        solution.inorder(root);
    }
}
