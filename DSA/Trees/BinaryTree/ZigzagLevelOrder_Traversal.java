// Zigzag Level Order Traversal In a Binary Tree Algorithm Implemented In Java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder_Traversal {
    // Class Node of the Binary Tree
    @SuppressWarnings("unused")
    public static class TreeNode{
        // Default Access Modifier And Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    
    // class to find the root of Binary Tree
    public static class BinaryTree{
        int index=-1;
        // Function to build the Binary Tree
        public TreeNode buildTree(int[] nodes){
            index++;
            if(index >= nodes.length || nodes[index]==-1){
                return null;
            }
            TreeNode newNode=new TreeNode(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // Function to find the zigzag level order traversal of the Binary Tree
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (leftToRight) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
            leftToRight = !leftToRight; // flip direction
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        TreeNode root=tree.buildTree(nodes);
        System.out.println("Root of the Binary Tree: "+root.val);
        ZigzagLevelOrder_Traversal solution=new ZigzagLevelOrder_Traversal();
        List<List<Integer>> result=solution.zigzagLevelOrder(root);
        System.out.println("Zigzag Level Order Traversal of the Binary Tree: "+result.toString());
    }
}

