// Two Sum IV - Input is a BST Algorithm Implementation In Java

import java.util.HashSet;
public class TwoSumIV_Input_IsA_BST {
   
    // TreeNode class
    public static class TreeNode {
        // Public Access Speicifer
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
        // Insert Operation
        public TreeNode insert(TreeNode root, int val) {
            if(root == null) {
                return new TreeNode(val);
            }
            
            // Recursive Relation
            if(val < root.val) {
                root.left = insert(root.left, val);
            }
            if(root.val < val) {
                root.right = insert(root.right, val);
            }
            return root;
        }

        HashSet<Integer> set = new HashSet<>();

        // Find Target Operation
        public boolean findTarget(TreeNode root, int k) {
            if(root == null) {
                return false;
            }
            if(set.contains(k - root.val)) {
                return true;
            }
            set.add(root.val);

            return findTarget(root.right,k) || findTarget(root.left,k);
        }

        // Display Operation
        public void display(TreeNode root) {
            if(root != null) {
                display(root.left);
                System.out.print(root.val+" ");
                display(root.right);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = null;
        int[] values = {5, 3, 6, 2, 4, 7};
        
        // Build BST
        for (int val : values) {
            root = sol.insert(root, val);
        }

        // Display BST
        System.out.print("Inorder Traversal: ");
        sol.display(root);

        // Find Target
        int k = 9;
        
        System.out.println("\nTarget Sum: " + k);
        System.out.println("Two Sum Exists: " + sol.findTarget(root, k));
    }
}
