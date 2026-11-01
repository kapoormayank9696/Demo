// LeetCode Problem 637 : Average of Levels in Binary Tree
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution637 {
    // Node class for the binary tree
    public static class TreeNode {
        // Data members
        int val;
        TreeNode left;
        TreeNode right;

        // Parameterized Constructor
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // Class to insert the node in binary tree
    public static class Solution {
        public int index = -1;

        // Insert function
        public TreeNode insert(Integer[] values) {
            index++;
            if(index >= values.length || values[index] == null) {
                return null;
            }
            // Create a new node with the current value
            TreeNode newNode = new TreeNode(values[index]);
            // Recursively insert left and right child nodes
            newNode.left = insert(values);
            newNode.right = insert(values);
            return newNode;
        }

        // Function to print the binary tree pre order
        public static void printPreOrder(TreeNode root) {
            if (root != null) {
                System.out.print(root.val + " ");
                printPreOrder(root.left);
                printPreOrder(root.right);
            }
        }

        // Average Of Levels
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new ArrayList<>();

            if(root == null) {
                return result;
            } else {
                Queue<TreeNode> queue = new LinkedList<>();
                queue.add(root);

                while(!queue.isEmpty()) {
                    int size = queue.size();
                    double sum = 0;
                
                    for(int i=0;i<size;i++) {
                        TreeNode node = queue.poll();
                        sum = sum + node.val;

                        if(node.left != null) {
                            queue.add(node.left);
                        }
                        if(node.right != null) {
                            queue.add(node.right);
                        }
                    }

                    double average = sum / size;
                    result.add(average);
                }
            }
            return result;
        }
    }

    // Main function
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Integer[] values = {9,3, 20, null, null, 15, 7};
        Integer[] values = {1,2,2,3,null,null,3,4,null,null,4};
        Solution tree = new Solution();
        TreeNode root = tree.insert(values);
        System.out.print("Pre-order Traversal of the Binary Tree: ");
        tree.printPreOrder(root);

        List<Double> averages = tree.averageOfLevels(root);
        System.out.print("\nAverage of Each Level:");
        System.out.println(averages);
    }
}
