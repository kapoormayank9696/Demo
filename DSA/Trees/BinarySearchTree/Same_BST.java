// Same Binary Search Tree Algorithm Implementation In Java

public class Same_BST {
    
    // Node class Of binary search tree
    @SuppressWarnings("unused")
    public static class TreeNode {
        // Data members
        int val;
        TreeNode left;
        TreeNode right;

        // Parameterized constructor
        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Functionto insert the node in the binary search tree
    public static TreeNode insert(TreeNode root,int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        if(val < root.val) {
            root.left = insert(root.left,val);
        } else if(val > root.val) {
            root.right = insert(root.right,val);
        }
        return root;
    }

    // Function to check if two binary search trees are same or not
    public static boolean isSameBST(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }
        if(root1.val != root2.val) {
            return false;
        }
        return isSameBST(root1.left,root2.left) && isSameBST(root1.right,root2.right);
    }

    // Function to print the binary search tree in order traversal
    public static void print(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    // Main method
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        TreeNode root1 = null;
        TreeNode root2 = null;
        for(int i : arr1) {
            root1 = insert(root1,i);
        }
        System.out.print("First Binary Search Tree:");
        print(root1);
        System.out.println();
        for(int i : arr2) {
            root2 = insert(root2,i);
        }
        System.out.print("Second Binary Search Tree:");
        print(root2);
        System.out.println();
        System.out.println("Are both Binary Search Trees same? " + isSameBST(root1,root2));
    }
}
