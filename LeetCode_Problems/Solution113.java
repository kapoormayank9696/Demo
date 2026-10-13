// LeetCode Problem 113 : Path Sum II

import java.util.ArrayList;
import java.util.List;
public class Solution113 {

    // TreeNode Class
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        // Parameterized Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Solution Class
    public static class Solution {

        public int index = -1;

        // Insert
        public TreeNode insert(int[] nums) {
            index++;
            if(index >= nums.length || nums[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nums[index]);

            // Recursive Calls
            newNode.left = insert(nums);
            newNode.right = insert(nums);
            return newNode;
        }

        // Function to help solve the path sum II algorithm
        public void solve(TreeNode root,int targetSum,List<Integer> list,List<List<Integer>> result) {
            if(root == null) {
                return;
            }

            list.add(root.val);

            if(root.left == null && root.right == null) {
                if(root.val == targetSum) {
                    result.add(new ArrayList<>(list));
                } 
            } else {
                solve(root.left,targetSum-root.val,list,result);
                solve(root.right,targetSum-root.val,list,result);
            }
            list.remove(list.size()-1);
        }

        // Function of Path Sum II
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();

            solve(root, targetSum, list, result);
            return result;
        }

        // Print
        public void printTree(TreeNode root) {
            if(root == null) {
                return;
            }
            System.out.print(root.val+" ");
            // Recursive Calls
            printTree(root.left);
            printTree(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {
            5, 4, 11, 7, -1, -1, 2, -1, -1, -1,
            8, 13, -1, -1, 4, 5, -1, -1, 1, -1, -1
        };
        Solution solution = new Solution();
        TreeNode root = solution.insert(nums);

        System.out.print("Print Orignal Binary Tree: ");
        solution.printTree(root);

        int targetSum = 22;
        System.out.print("\nPath Sum : ");
        List<List<Integer>> result = solution.pathSum(root, targetSum);
        for(List<Integer> num: result) {
            for(int n:num) {
                System.out.print(n+" ");
            }
            System.out.print("\n");
        }
    }
}
