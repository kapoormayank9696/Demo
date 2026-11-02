// Leetcode Problem 235: Lowest Common Ancestor of a Binary Search Tree
public class Solution235 {
    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;
        
        public TreeNode(int data) {
            this.data = data;
        }
    }
    // Function to insert the nodes in Binary Search Tree(BST)
    public static TreeNode insert(TreeNode root,int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        // Recursion Function
        if(root.data > val) {
            // Left Subtree
            root.left=insert(root.left,val);
        }
        if(root.data < val) {
            // Right Subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    // Function to print nodes of Binary Search Tree(BSt)
    public static void print(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        print(root.left); // Left Subtree
        print(root.right); //Right Subtree
    }

    // Function to search the node in Binary Search Tree(BST)
    public static TreeNode search(TreeNode root, int val) {
        if (root == null || root.data == val) return root;

        if (val < root.data) {
            return search(root.left, val);
        }

        return search(root.right, val);
    }

    // Function to find the Lowest Common Ancestor of two nodes in Binary Search Tree(BST)
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.data < root.data && q.data < root.data) {
            return lowestCommonAncestor(root.left,p,q);
        }

        if(root.data < p.data && root.data < q.data) {
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }

    // Main function
    public static void main(String[] args) {
        int[] values = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        TreeNode root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Preorder Traversal: ");
        print(root);

        TreeNode p = search(root, 2);
        TreeNode q = search(root, 8);

        TreeNode lca = lowestCommonAncestor(root, p, q);

        if (lca != null) {
            System.out.println("\nLowest Common Ancestor: " + lca.data);
        }
    }
}

