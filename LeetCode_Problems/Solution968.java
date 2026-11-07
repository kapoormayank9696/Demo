// LeetCode Problem 968: Binary Tree Cameras
public class Solution968 {
    // TreeNode Class
    public static class TreeNode {
        // Data Members
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Solution Class
    public static class Solution {
        public int count=0;
        public int index = -1;

        // Insert Function to Insert a Node in BST
        public TreeNode insert(int[] nums) {
            index++;
            if(index >= nums.length || nums[index] == -1) {
                return null;
            }
            TreeNode root = new TreeNode(nums[index]);
            root.left = insert(nums);
            root.right = insert(nums);
            return root;
        }

        // Function to Count Minimum Number of Cameras Needed to Monitor All Nodes in a Binary Tree
        public int minCameraCover(TreeNode root) {
            if(root == null) {
                return 0;
            }

            if(dfs(root) == -1) {
                count++;
            }
            return count;
        }
        
        // Depth-First Search Function to Count Cameras
        public int dfs(TreeNode root){
            if(root == null) {
                return 0;
            }

            int leftCount = dfs(root.left);
            int rightCount = dfs(root.right);

            if(leftCount == -1 || rightCount == -1) {
                count++;
                return 1;
            }

            if(leftCount == 1 || rightCount == 1) {
                return 0;
            }

            return -1;
        }

        // Display Function to Print the Binary Tree
        public void display(TreeNode root) {
            if(root == null) {
                return;
            }
            display(root.left);
            System.out.print(root.val + " ");
            display(root.right);
        }
    }

    // Main Function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, -1, -1, 0, -1, -1};
        TreeNode root = solution.insert(nums);
        int camerasNeeded = solution.minCameraCover(root);
        System.out.println("Minimum number of cameras needed: " + camerasNeeded);
    }
}

