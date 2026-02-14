// LeetCode Problem 145: Binary Tree Postorder Traversal

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Solution145 {
    // Tree node definition
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { 
            this.val = x; 
            this.left = this.right = null;
        }
    }

    // Build tree from level-order array safely
    public static TreeNode buildTree(int[] nodes, int i) {
        if (i >= nodes.length || nodes[i] == -1) return null;
        TreeNode root = new TreeNode(nodes[i]);
        root.left = buildTree(nodes, 2*i + 1);
        root.right = buildTree(nodes, 2*i + 2);
        return root;
    }

    // Postorder traversal
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private static void postorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorderHelper(root.left, result);
        postorderHelper(root.right, result);
        result.add(root.val);
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

        List<Integer> postorder = postorderTraversal(root);
        System.out.println("Postorder traversal: " + postorder);
        sc.close();
    }
}


