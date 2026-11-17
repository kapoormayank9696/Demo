// LeetCode Problem 563 : Binary Tree Tilt
public class Solution563 {
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
        public int result = 0;

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

        // Binary Tree Tilt Function
        public int findTilt(TreeNode root) {
            result = 0;
            postOrder(root);
            return result;
        }

        // Post Order Function
        public int postOrder(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = postOrder(root.left);
            int right = postOrder(root.right);
            result = result + Math.abs(left - right);
            return left + right + root.val;
        }
        
        // Display Function
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

        int[] nums = {5, 3, 9, 2, 4};

        TreeNode root = solution.insert(nums);

        // Display Binary Tree
        System.out.print("Inorder Traversal: ");
        solution.display(root);

        // Find Binary Tree Tilt
        System.out.println("\nBinary Tree Tilt: "+ solution.findTilt(root));
    }
}
