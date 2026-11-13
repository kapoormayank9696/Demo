// LeetCode Problem 515 : Find Largest Value in Each Tree Row
import java.util.*;
public class Solution515 {

    // Binary Tree Class
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

    // Solution Class
    public static class Solution {
        int index = -1;

        // Build Tree
        public TreeNode buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            // Creating New Node
            TreeNode newNode = new TreeNode(nodes[index]);

            // Recursive Function
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Find Largest Value From Binary Tree
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                int max = Integer.MIN_VALUE;

                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    max = Math.max(max, temp.val);

                    if (temp.left != null) {
                        queue.add(temp.left);
                    }

                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                }
                result.add(max);
            }
            return result;
        }

        // PreOrder Traversal
        public void preOrder(TreeNode root) {
            if(root == null) return;
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Function to perform the pre order traversal
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");

        // Recursive calls for left and right subtrees
        preOrder(root.left);
        preOrder(root.right);
    }
    
    // Main function

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nodes = {
            1, 3, 5, -1, -1, 3, -1, -1,
            2, -1, 9, -1, -1
        };

        TreeNode root = sol.buildTree(nodes);

        System.out.print("Preorder Traversal: ");
        sol.preOrder(root);

        System.out.print("\nLargest Values in Each Tree Row: ");

        List<Integer> result = sol.largestValues(root);

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
