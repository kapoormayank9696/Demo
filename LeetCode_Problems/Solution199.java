// LeetCode Problem 199: Binary Tree Right Side View

public class Solution199{
    // Node class of Binary Tree(BT)
    @SuppressWarnings("unused")
    public static class TreeNode {
        // Default Access Modifier And Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // class to find the root of Binary Tree(BT)
    static class BinaryTree {
        int index = -1;

        public TreeNode buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[index], null, null);
            // Recursive function
            newNode.left = buildTree(nodes); // for left side of Binary Tree
            newNode.right = buildTree(nodes); // for right side of Binary Tree
            return newNode;
        }
    }

    // Function to find the right side view of Binary Tree(BT)
    public static void rightSideView(TreeNode root) {
        if (root == null) {
            return;
        }
        // Recursive function
        System.out.print(root.val + " ");
        rightSideView(root.right); // for right side of Binary Tree
    }
    public static void main(String[] args) {
        int[] nodes={5,3,1,-1,-1,4,-1,-1,7,6,-1,-1,8,-1,-1};
        BinaryTree tree=new BinaryTree();
        TreeNode root=tree.buildTree(nodes);
        System.out.println("Root of the Binary Tree is: "+root.val);
        System.out.print("Right Side View of Binary Tree is: ");
        rightSideView(root);
    }
}

