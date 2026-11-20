// LeetCode Problem 606 : Construct String from Binary Tree
public class Solution606 {

    // Node class
    public static class TreeNode {

        public int data;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree class
    public static class Solution {

        // Insert
        public TreeNode insert(TreeNode root, int data) {

            if (root == null) {
                return new TreeNode(data);
            }

            if (data < root.data) {
                root.left = insert(root.left, data);
            }
            else {
                root.right = insert(root.right, data);
            }

            return root;
        }

        // Construct String From Binary Tree
        public String tree2str(TreeNode root) {

            if (root == null) {
                return "";
            }

            StringBuilder str = new StringBuilder();

            str.append(root.data);

            // Left Subtree
            if (root.left != null) {
                str.append("(");
                str.append(tree2str(root.left));
                str.append(")");
            }
            else if (root.right != null) {
                str.append("()");
            }

            // Right Subtree
            if (root.right != null) {
                str.append("(");
                str.append(tree2str(root.right));
                str.append(")");
            }

            return str.toString();
        }

        // Preorder traversal
        public void print(TreeNode root) {

            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");

            print(root.left);
            print(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {

        Solution sol = new Solution();

        TreeNode root = null;

        // Creating Binary Tree
        root = sol.insert(root, 1);
        root = sol.insert(root, 2);
        root = sol.insert(root, 3);
        root = sol.insert(root, 4);

        // Preorder Traversal
        System.out.print("Preorder Traversal: ");
        sol.print(root);

        // Construct String
        System.out.println("\nConstructed String: "
                + sol.tree2str(root));
    }
}
