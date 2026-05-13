// PostOrder To InOrder Algorithm Implementation In Java

import java.util.HashMap;
public class PostOrder_TO_InOrder {
    // Node class of Binary Tree
    @SuppressWarnings("unused")
    public static class TreeNode {
        // Data Members
        int data;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor/ Dynamic Constructor
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree class
    @SuppressWarnings("unused")
    public static class BinaryTree {
        HashMap<Integer, Integer> map = new HashMap<>();
        public int postorderIndex=0;
        public int index=-1;
        public TreeNode buildTree(int[] postOrder) {
            index++;
            if (postOrder[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(postOrder[index]);
            // Recursively build left and right subtrees
            newNode.left = buildTree(postOrder);
            newNode.right = buildTree(postOrder);
            return newNode;
        }

        // Function to convert PostOrder to InOrder
        public TreeNode postOrderToInOrder(int[] inorder,int[] postOrder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            postorderIndex = postOrder.length - 1;
            TreeNode root=postOrderToInOrderHelper(postOrder, 0, inorder.length - 1);
            return root;
        }

        // Helper function to convert PostOrder to InOrder
        private TreeNode postOrderToInOrderHelper(int[] postOrder, int start, int end) {
            if (start > end) {
                return null;
            }
            int rootValue = postOrder[postorderIndex];
            TreeNode root = new TreeNode(rootValue);
            postorderIndex--;
            int rootIndex = map.get(rootValue);
            // Recursively build left and right subtrees
            root.right = postOrderToInOrderHelper(postOrder, rootIndex + 1, end);
            root.left = postOrderToInOrderHelper(postOrder, start, rootIndex - 1);
            return root;
        }
    }

    // Function to print the Binary Tree
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={3,9,20,-1,-1,15,7,-1,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        System.out.println("Root Of Binary Tree: " + root.data);
        System.out.print("Print Tree: ");
        printTree(root);
        int[] postOrder = {9, 15, 7, 20, 3};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode newRoot = tree.postOrderToInOrder(inorder, postOrder);
        System.out.println("\nRoot Of New Binary Tree: " + newRoot.data);
        System.out.print("Print New Tree: ");
        printTree(newRoot);
    }
}
