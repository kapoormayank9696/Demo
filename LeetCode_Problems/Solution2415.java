// LeetCode Problem 2415: Reverse Odd Levels of Binary Tree

import java.util.LinkedList;
import java.util.Queue;

public class Solution2415 {

    public static class TreeNode {

        // Public Specifiers And Data Members
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

    public static class Solution {
        public int index = -1;

        // Build Binary Tree using preorder array
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

        // Reverse values at odd levels
        public TreeNode reverseOddLevels(TreeNode root) {
            if (root == null) {
                return null;
            }

            dfs(root.left, root.right, 1);
            return root;
        }

        // Depth-First Search to swap values at odd levels
        public void dfs(TreeNode node1, TreeNode node2, int level) {
            if (node1 == null || node2 == null) {
                return;
            }

            if (level % 2 == 1) {
                int temp = node1.val;
                node1.val = node2.val;
                node2.val = temp;
            }

            dfs(node1.left, node2.right, level + 1);
            dfs(node1.right, node2.left, level + 1);
        }

        // Print preorder traversal
        public void printTree(TreeNode root) {
            if (root == null) return;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }   
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {
            2, 3, 8, -1, -1, 13, -1, -1,
            5, 21, -1, -1, 34, -1, -1
        };

        Solution solution = new Solution();
        TreeNode root = solution.insert(arr);

        System.out.print("Original Binary Tree: ");
        solution.printTree(root);

        root = solution.reverseOddLevels(root);

        System.out.print("\nAfter reversing odd levels: ");
        solution.printTree(root);
    }
}
