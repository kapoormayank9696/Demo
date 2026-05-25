// Check Binary Search Tree Is Symmetry Or Not Algorithm Implementation In Java

public class Is_Symmetry {
    // Node class of Binary Search Tree(BST)
    public static class TreeNode {
        // Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode(int val) {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    // Function to insert the node in Binary Search Tree(BST)
    public static TreeNode buildBST(int[] arr,int n,int i) {
        if(i >= n) {
            return null;
        }
        // Create node(Recursive Method)
        TreeNode root = new TreeNode(arr[i]);
        // Left Subtree
        root.left=buildBST(arr,n,2*i+1);
        // Right Subtree
        root.right=buildBST(arr,n,2*i+2);
        return root;
    }

    // Function to print Binary Search Tree(BST)
    public static void printBST(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        printBST(root.left);
        printBST(root.right);
    }

    // Class to carry the symmetry check methods
    public static class Solution {
        // Check mirror
        public boolean isCheck(TreeNode t1,TreeNode t2) {
            if(t1 == null && t2 == null) return true;
            if(t1 == null || t2 == null) return false;
            if(t1.val != t2.val) return false;
            return isCheck(t1.left, t2.right) && isCheck(t1.right, t2.left);
        }

        // Check symmetric
        public boolean isSymmetry(TreeNode root) {
            if(root == null) return true;
            return isCheck(root.left,root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr={1,2,2,3,4,4,3};
        TreeNode root = buildBST(arr,arr.length,0);
        System.out.print("Print Binary Search Tree: ");
        printBST(root);
        System.out.println("\nIs the binary search tree symmetric? "+sol.isSymmetry(root));
    }
}

