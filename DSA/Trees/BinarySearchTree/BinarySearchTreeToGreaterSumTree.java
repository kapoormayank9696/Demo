// Binary Search Tree to Greater Sum Tree Algorithm Implement in a Java
public class BinarySearchTreeToGreaterSumTree {
    
    // TreeNode Class
    public static class TreeNode {

        // Data Members And Public Access Modifiers
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        public TreeNode(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    public static class Solution {
        public int index = -1;
        public int sum = 0;

        // Build binary tree from preorder array (-1 means null)
        public TreeNode insert(int[] nums) {
            index++;

            if (index >= nums.length || nums[index] == -1) {
                return null;
            }

            TreeNode newNode = new TreeNode(nums[index]);
            newNode.left = insert(nums);
            newNode.right = insert(nums);

            return newNode;
        }

        // Convert BST to Greater Tree
        public TreeNode convertBST(TreeNode root) {
            if (root == null) {
                return null;
            }
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
            return root;
        }

        // Display binary tree in preorder
        public void display(TreeNode root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val + " ");
            display(root.left);
            display(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {
            4, 1, 6, 0, 2, 5, 7, -1, -1,
            -1, 3, -1, -1, -1, 8
        };

        TreeNode root = solution.insert(nums);

        System.out.print("Original Binary Search Tree (BST): ");
        solution.display(root);
        System.out.println();

        solution.convertBST(root);

        System.out.print("Converted Greater Tree: ");
        solution.display(root);
    }
}

