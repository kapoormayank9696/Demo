// LeetCode Problem 222: Count Complete Tree Nodes

import java.util.Scanner;
public class Solution222 {

    // class definition for a binary tree node
    @SuppressWarnings("unused")
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // class to find the root of the complete binary tree from the given array
    public static class CompleteBinaryTree {
        int index=-1;
        public TreeNode buildTree(int[] arr){
            index++;
            if(arr[index] == -1){
                return null;
            }
            TreeNode newNode=new TreeNode(arr[index]);
            newNode.left=buildTree(arr);
            newNode.right=buildTree(arr);
            return newNode;
        }
    }
    
    // Function to count the number of nodes in a complete binary tree
     public static int countNodes(TreeNode root) {
        int result=buildTree(root);
        return result;
    }
    
    public static int buildTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftNodes=buildTree(root.left);
        int rightNodes=buildTree(root.right);
        return leftNodes+rightNodes+1;
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        CompleteBinaryTree cbt=new CompleteBinaryTree();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements of the complete binary tree (level order): ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        TreeNode root=cbt.buildTree(arr);
        System.out.println("Root of the complete binary tree: "+root.val);
        int result=countNodes(root);
        System.out.println("Number of nodes in the complete binary tree: "+result);
        sc.close();
    }
}
