// LeetCode Problem 102: Binary Tree Level Order Traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Solution102{
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

    // Function to find the level order traversal of the Binary Tree
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> level=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode currNode=queue.remove();
            if(currNode == null){
                list.add(level);
                level=new ArrayList<>();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
            else{
                level.add(currNode.val);
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }
        return list;
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        TreeNode root=tree.buildTree(nodes);
        System.out.println("Root of the Binary Tree: "+root.val);
        Solution102 solution=new Solution102();
        List<List<Integer>> result=solution.levelOrder(root);
        System.out.println("Level Order Traversal of the Binary Tree: "+result.toString());
    }
}
