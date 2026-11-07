// LeetCode Problem 230 : Kth Smallest Element in a BST
public class Solution230 {

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
        public int answer = 0;
        public int count = 0;
        
        // Insert Function to Insert a Node in BST
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

        // Function to find the kth smallest element in a BST
        public int kthSmallest(TreeNode root, int k) {
            inorder(root, k);
            return answer;
        }

        // Inorder Traversal Function
        public void inorder(TreeNode root,int k) {
            if(root == null) return;
            inorder(root.left,k);
            count ++;
            if(count == k) {
                answer = root.val;
                return;
            }
            inorder(root.right,k);
        }

        // Display Function to Print the BST
        public void display(TreeNode root) {
            if(root == null) return;
            display(root.left);
            System.out.print(root.val + " ");
            display(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = null;

        // Insert nodes into the BST
        int[] values = {5, 3, 6, 2, 4, 1};
        for(int val : values) {
            root = solution.insert(root, val);
        }

        // Display the BST
        System.out.print("Inorder Traversal of BST: ");
        solution.display(root);
        System.out.println();

        // Find the kth smallest element
        int k = 3;
        int kthSmallestElement = solution.kthSmallest(root, k);
        System.out.println(k + "th smallest element in the BST is: " + kthSmallestElement);
    }
}
