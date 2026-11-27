// Balance a Binary Search Tree Algorithm Implementation In Java

import java.util.ArrayList;
import java.util.List;

public class Balance_A_BinarySearchTree {

    // Node class for the binary tree
    public static class TreeNode {

        // Data members
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Solution class
    public static class Solution {

        // Function to insert the nodes in the binary tree
        public TreeNode insert(TreeNode root, int val) {

            if (root == null) {
                return new TreeNode(val);
            }

            // Left Subtree
            if (val < root.val) {
                root.left = insert(root.left, val);
            }

            // Right Subtree
            else {
                root.right = insert(root.right, val);
            }

            return root;
        }

        // Function to print the binary tree preorder
        public void printPreOrder(TreeNode root) {

            if (root != null) {
                System.out.print(root.val + " ");
                printPreOrder(root.left);
                printPreOrder(root.right);
            }
        }

        // Inorder Function
        public void inorder(TreeNode root, List<Integer> list) {

            if (root == null) {
                return;
            }

            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }

        // Build Tree
        public TreeNode buildTree(List<Integer> list, int start, int end) {

            if (start > end) {
                return null;
            }

            int mid = (start + end) / 2;

            TreeNode node = new TreeNode(list.get(mid));

            node.left = buildTree(list, start, mid - 1);
            node.right = buildTree(list, mid + 1, end);

            return node;
        }

        // Balance BST
        public TreeNode balanceBST(TreeNode root) {

            List<Integer> list = new ArrayList<>();

            inorder(root, list);

            return buildTree(list, 0, list.size() - 1);
        }
    }

    // Main Function
    public static void main(String[] args) {

        Solution sol = new Solution();

        TreeNode root = null;

        // Insert Nodes
        root = sol.insert(root, 1);
        root = sol.insert(root, 2);
        root = sol.insert(root, 3);
        root = sol.insert(root, 4);

        System.out.print("Original BST Preorder: ");
        sol.printPreOrder(root);

        System.out.println();

        // Balance BST
        TreeNode balancedRoot = sol.balanceBST(root);

        System.out.print("Balanced BST Preorder: ");
        sol.printPreOrder(balancedRoot);

        System.out.println();
    }
}
