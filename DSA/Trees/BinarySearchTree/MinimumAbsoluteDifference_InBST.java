// Minimum Absolute Difference in BST Algorithm Implementation In Java
public class MinimumAbsoluteDifference_InBST {

    // TreeNode Class
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
        public int min = Integer.MAX_VALUE;
        public TreeNode prev = null;
    
        // Insert Function to insert a new node in BST
        public TreeNode insert(TreeNode root, int val) {
            if(root == null) {
                return new TreeNode(val);
            }
            if(val < root.val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }

        // Function to get the minimum absolute difference in BST
        public int getMinimumDifference(TreeNode root) {
            findDifference(root);
            return min;
        }

        // Inorder Traversal to find the minimum absolute difference
        public void findDifference(TreeNode root) {
            if(root == null) {
                return;
            }
            findDifference(root.left);
            if(prev != null) {
                min = Math.min(min, root.val - prev.val);
            }
            prev = root;
            findDifference(root.right);
        }

        // Display Function
        public void display(TreeNode root) {
            if(root == null) {
                return;
            }
            display(root.left);
            System.out.print(root.val + " ");
            display(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] values = {4,2,6,1,3};
        TreeNode root = null;

        for(int num:values){
            root=sol.insert(root, num);
        }
        System.out.print("Print BST : ");
        sol.display(root);

        System.out.println("\nMinimum Difference Between BST Tree Nodes: "+sol.getMinimumDifference(root));
    }
}

