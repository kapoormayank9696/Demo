// Flatten Binary Tree to Linked List Algorithm Implement In Java

public class Flatten_Binary_Tree_To_Linked_List {

    public static class TreeNode {

        // Data Members
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

    // Solution class
    public static class Solution {
        public int index = -1;

        // Build Binary Tree
        public TreeNode insert(int[] arr) {
            index++;
            if (index >= arr.length || arr[index] == -1) {
                return null;
            }

            TreeNode node = new TreeNode(arr[index]);

            node.left = insert(arr);
            node.right = insert(arr);

            return node;
        }

        public TreeNode prev = null;

        // Flatten Binary Tree
        public void flatten(TreeNode root) {

            if (root == null) {
                return;
            }

            // Reverse Preorder:
            // Right -> Left -> Root
            flatten(root.right);
            flatten(root.left);

            // Connect current node with previous node
            root.right = prev;

            // Left should always be null
            root.left = null;

            // Update previous node
            prev = root;
        }

        // Print Function
        public void print(TreeNode root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val + " ");
            print(root.left);
            print(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {
            1, 2, 3, -1, -1, 4, -1, -1,
            5, -1, -1
        };
        Solution solution = new Solution();

        TreeNode root = solution.insert(arr);

        solution.prev = null;

        System.out.print("Original Binary Tree:");
        solution.print(root);

        solution.flatten(root);

        System.out.print("\nFlattened Linked List:");
        solution.print(root);
    }
}