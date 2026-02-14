// LeetCode Problem 144: Binary Tree Preorder Traversal

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Solution144 {
    // Tree node definition
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    // Build tree from level-order array safely
    public static TreeNode buildTree(int[] nodes, int i) {
        if (i >= nodes.length || nodes[i] == -1) return null;
        TreeNode root = new TreeNode(nodes[i]);
        root.left = buildTree(nodes, 2*i + 1);
        root.right = buildTree(nodes, 2*i + 2);
        return root;
    }

    // Preorder traversal
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private static void preorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderHelper(root.left, result);
        preorderHelper(root.right, result);
    }

    // Main method
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[] nodes = new int[n];
        System.out.print("Enter elements in level-order (-1 for null): ");
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        TreeNode root = buildTree(nodes, 0);
        if (root != null)
            System.out.println("Root of the tree: " + root.val);
        else
            System.out.println("Tree is empty.");

        List<Integer> preorder = preorderTraversal(root);
        System.out.println("Preorder traversal: " + preorder);
        sc.close();
    }
}


