// LeetCode Problem 107: Binary Tree Level Order Traversal II
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Solution107 {
    // Node class for binary tree
    class TreeNode {
        // Default Access Modifier And Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }
    // Function to insert nodes into the binary tree
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;
        Solution107 sol = new Solution107();
        TreeNode root = sol.new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();
            if (arr[i] != null) {
                current.left = sol.new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                current.right = sol.new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }
    
    // Function to perform level order traversal from bottom to top
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(0, currentLevel); // Add the current level at the beginning of the result list
        }
        return result;
    }
    
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter values (-1 for null): ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = (val == -1) ? null : val;
        }
        TreeNode root = buildTree(arr);
        List<List<Integer>> result = levelOrderBottom(root);
        System.out.println(result);
    }
}

