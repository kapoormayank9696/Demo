// Lowest Common Ancestor of a Binary Tree Algorithm Implement in a Java

public class LowestCommonAncestor_Of_A_BinaryTree {
    // Node class for N-ary Tree
    public static class TreeNode {
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

    // Function to print the nodes of Binary Tree
    // Class Solution
    public static class Solution {
        
        public int index = -1;
        
        // Build Tree
        public TreeNode buildTree(int[] nums) {
            index++;
            
            if(nums.length <= index || nums[index] == -1) {
                return null;
            }

            TreeNode root = new TreeNode(nums[index]);
            root.left = buildTree(nums);
            root.right = buildTree(nums);

            return root;
        }

        // Display the nodes of Binary Tree in Preorder Traversal
        public void display(TreeNode root) {
            if (root == null) {
                return;
            }

            System.out.print(root.val + " ");

            display(root.left);
            display(root.right);
        }

        // Function to find the Lowest Common Ancestor of two nodes in Binary Tree
        public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) {
                return root;
            }

            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);

            if(left != null && right != null) {
                return root;
            }

            return (left != null)?left:right;
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {
            3, 5, 6, -1, -1, 2, 7, -1, -1,
            4, -1, -1, 1, 0, -1, -1, 8, -1, -1
        };
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(nums);

        System.out.print("Preorder Traversal: ");
        solution.display(root);

        TreeNode p = root.left;       // Node with value 5
        TreeNode q = root.right;      // Node with value 1

        @SuppressWarnings("static-access")
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);

        if (lca != null) {
            System.out.println(
                "\nLowest Common Ancestor of " + p.val +
                " and " + q.val + " is: " + lca.val
            );
        } else {
            System.out.println("\nLowest Common Ancestor not found.");
        }
    }
}
