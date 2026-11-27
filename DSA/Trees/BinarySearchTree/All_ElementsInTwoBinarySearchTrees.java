// All Elements in Two Binary Search Trees Algorithm Implementation In Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class All_ElementsInTwoBinarySearchTrees {
    // Node class for the binary tree
    public static class TreeNode {
        
        // Data members
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Solution class
    public static class Solution {

        // Function to insert the nodes in the binary tree
        public TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            
            // Left Subtree
            if (val < root.val) {
                root.left = insert(root.left, val);
            } 
            // Right Subtree
            else {
                root.right = insert(root.right, val);
            }
            return root;
        }
        
        // Function to print the binary tree pre order
        public void printPreOrder(TreeNode root) {
            if (root != null) {
                System.out.print(root.val + " ");
                printPreOrder(root.left);
                printPreOrder(root.right);
            }
        }
        
        // Inorder Function
        public void inorder(TreeNode root, List<Integer> list) {
            if(root == null) { return; }
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }

        // All Elements in Two Binary Search Trees Function
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> result = new ArrayList<>();
            inorder(root1,result);
            inorder(root2,result);
            Collections.sort(result);
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root1 = null;
        TreeNode root2 = null;

        // First BST
        root1 = sol.insert(root1, 2);
        root1 = sol.insert(root1, 1);
        root1 = sol.insert(root1, 4);

        // Second BST
        root2 = sol.insert(root2, 1);
        root2 = sol.insert(root2, 0);
        root2 = sol.insert(root2, 3);

        System.out.print("First BST Preorder: ");
        sol.printPreOrder(root1);

        System.out.println();

        System.out.print("Second BST Preorder: ");
        sol.printPreOrder(root2);

        System.out.println();

        // Get All Elements
        List<Integer> result = sol.getAllElements(root1, root2);

        System.out.println("All Elements in Sorted Order: " + result);
    }
}
