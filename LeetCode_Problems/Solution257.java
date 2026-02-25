// LeetCode Problem 257: Binary Tree Paths

import java.util.ArrayList;
import java.util.List;
public class Solution257{
    // Node class for Binary Tree
    public static class TreeNode{
        // Default Access Modifier And Data Members
        int val;
        TreeNode left;
        TreeNode right;
        // Parameterized Constructor
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    // Function to find the root of Binary Tree from an array representation
    static class BuildTree {
        int index=-1;
        public TreeNode buildTree(int[] values) {
            index++;
            if(index >= values.length || values[index] == -1) {
                return null;
            }
            // Create a new TreeNode with the current value
            TreeNode newNode =new TreeNode(values[index]);
            // Recursive Calls To Build Left And Right Subtrees
            newNode.left=buildTree(values); // for Left Subtree
            newNode.right=buildTree(values); // for Right Subtree
            return newNode;
        }
    }
    
    // Function To Find All Paths From Root To Leaf Nodes
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        findPaths(root, "", list);
        return list;
    }

    // Helper Function To Find Paths
    public static void findPaths(TreeNode node, String path, List<String> list) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            list.add(path + node.val);
        }
        // Recursive Calls To Find Paths In Left And Right Subtrees
        findPaths(node.left, path + node.val + "->", list); // for Left Subtree
        findPaths(node.right, path + node.val + "->", list); // for Right Subtree
    }

    // Main function
    public static void main(String[] args) {
        int[] rootValues={1, 2,-1, 5, -1, -1, 3, -1, -1}; // -1 represents null
        BuildTree buildTree=new BuildTree();
        TreeNode root=buildTree.buildTree(rootValues);
        Solution257 solution=new Solution257();
        List<String> paths=solution.binaryTreePaths(root);
        System.out.println(paths.toString());
    }
}

