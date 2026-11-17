// LeetCode Problem 1161: Maximum Level Sum of a Binary Tree
import java.util.*;
public class Solution1161 {

    // TreeNode class
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

        // Insert Function to Build Binary Tree
        public TreeNode insert(int[] nums) {
            index++;
            if (index >= nums.length || nums[index] == -1) {
                return null;
            }

            TreeNode root = new TreeNode(nums[index]);
            root.left = insert(nums);
            root.right = insert(nums);
            return root;
        }

        // Maximum Level Sum
        public int maxLevelSum(TreeNode root) {
            if (root == null) {
                return 0;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0;
            int bestLevel = 0;
            int max = Integer.MIN_VALUE;

            while (!queue.isEmpty()) {
                int size = queue.size();
                int sum = 0;
                level++;

                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    sum = sum + temp.val;
                    
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }

                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                }

                if (max < sum) {
                    max = sum;
                    bestLevel = level;
                }
            }
            return bestLevel;
        }

        // Display Operation
            public void display(TreeNode root) {
                if (root == null) {
                    return;
                }
                display(root.left);
                System.out.print(root.val + " ");
                display(root.right);
            }
        }

        // Main function
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {
                1, 7, 7, -1, -1, -8, -1, -1,
                0, -1, -1
            };
            TreeNode root = solution.insert(nums);
            
            // Display Binary Tree
            System.out.print("Inorder Traversal: ");
            solution.display(root);

            // Maximum Level Sum
            System.out.println("\nMaximum Level Sum: "+ solution.maxLevelSum(root));
    }
}

