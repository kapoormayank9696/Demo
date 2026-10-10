// Invert Binary Tree Algorithm Implement In Java
public class Invert_Binary_Tree {

    public static class TreeNode {
        // Public Specifier And Data Members
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
        public int index = -1;
        
        // Insert Node 
        public TreeNode insertNode(int[] arr) {
            index++;
            if (index >= arr.length || arr[index] == -1) {
                return null;
            }

            TreeNode newNode = new TreeNode(arr[index]);
            newNode.left = insertNode(arr);
            newNode.right = insertNode(arr);

            return newNode;
        }

        // Invert Binary Tree Function
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            // Swap the left and right children
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            // Recursively invert the left and right subtrees
            invertTree(root.left);
            invertTree(root.right);

            return root;
        }

        // Preorder Traversal Function
        public void preorderTraversal(TreeNode root) {
            if (root == null) {
                return;
            }

            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 2, 1, -1, -1, 3, -1, -1, 7, 6, -1, -1, 9, -1, -1};
        TreeNode root = solution.insertNode(arr);
        
        System.out.print("Original Tree (Preorder): ");
        solution.preorderTraversal(root);
        
        TreeNode invertedRoot = solution.invertTree(root);
        System.out.print("\nInverted Tree (Preorder): ");
        solution.preorderTraversal(invertedRoot);
    }
}
