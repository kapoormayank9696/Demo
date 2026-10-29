 // Range Sum of BST Algorithm Implementation In Java
public class RangeSumOfBST {

    public static class TreeNode {
        // Data Members
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

    public static class Solution {

        // Function to insert values in BST
        TreeNode insert(TreeNode root, int value) {
            if (root == null) {
                return new TreeNode(value);
            }

            // Insert into left or right subtree
            if (value < root.val) {
                root.left = insert(root.left, value);
            } else {
                root.right = insert(root.right, value);
            }

            return root;
        }

        // Function of Range Sum of BST
        int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) {
                return 0;
            }

            if (root.val > high) {
                return rangeSumBST(root.left, low, high);
            } else if (root.val < low) {
                return rangeSumBST(root.right, low, high);
            } else {
                return root.val
                    + rangeSumBST(root.left, low, high)
                    + rangeSumBST(root.right, low, high);
            }
        }

        // Function to print BST (Preorder)
        void printBST(TreeNode root) {
            if (root == null) {
                return;
            }

            System.out.print(root.val + " ");
            printBST(root.left);
            printBST(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes = {10, 5, 15, 3, 7, 12, 18};

        Solution sol = new Solution();
        TreeNode root = null;

        // Inserting values into BST
        for (int value : nodes) {
            root = sol.insert(root, value);
        }

        System.out.print("Print Binary Search Tree: ");
        sol.printBST(root);

        int low = 7, high = 15;

        System.out.println(
            "\nSum of range node elements: "
            + sol.rangeSumBST(root, low, high)
        );
    }
}
