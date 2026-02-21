// LeetCode Problem 572: Subtree of Another Tree
// Time Complexity of Approach is: O(n*m) where n and m are the number of nodes in the two trees respectively.

public class Solution572 {
    // Node class of Binary Tree(BT)
    @SuppressWarnings("unused")
    public static class TreeNode{
        // Default Access Modifier And Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // class to find the root of Binary Tree(BT)
    public static class BinaryTree{
        int index=-1;
        public TreeNode buildTree(int[] nodes) {
            index++;
            if(index >= nodes.length || nodes[index] == -1){
                return null;
            }
            TreeNode newNode=new TreeNode(nodes[index]);
            // Recursive function
            newNode.left=buildTree(nodes); // for left side of Binary Tree
            newNode.right=buildTree(nodes); // for right side of Binary Tree
            return newNode;
        }
    }

    // Function to find the identical of two Binary Tree(BT)
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isIdentical(root.left,subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    // Function to find the subtree of another tree
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }if(root == null){
            return false;
        }if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    // Main function
    public static void main(String[] args) {
        Solution572 solution=new Solution572();
        int[] nodes1={3,4,1,-1,-1,2,-1,-1,5,-1,-1};
        int[] nodes2={4,1,-1,-1,2,-1,-1};
        BinaryTree tree=new BinaryTree();
        TreeNode root=tree.buildTree(nodes1);
        BinaryTree tree2=new BinaryTree();
        TreeNode subRoot=tree2.buildTree(nodes2);
        System.out.println("Root of the Binary Tree is: "+root.val);
        System.out.println("Root of the Subtree is: "+subRoot.val);
        System.out.println("Is Subtree: "+solution.isSubtree(root, subRoot));
    }
}

