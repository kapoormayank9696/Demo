// LeetCode Problem 297 : Serialize and Deserialize Binary Tree
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution297 {
    
    // Binary Tree class
    public static class TreeNode {
        
        // Public Access Specifier And Data Members
        public int val;
        public TreeNode left;
        public TreeNode right;
      
        // Parameterized Constructor
        public TreeNode(int x) {
            this.val = x; 
            this.left = null;
            this.right = null;
        }
    }

    // Class to insert the node in binary tree
    public static class Solution {
        public int index = -1;
        public TreeNode insert(int[] values) {
            index++;
            if(index >= values.length || values[index] == -1) {
                return null;
            }
            // Create a new node with the current value
            TreeNode newNode = new TreeNode(values[index]);
            // Recursively insert left and right child nodes
            newNode.left = insert(values);
            newNode.right = insert(values);
            return newNode;
        }

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder str = new StringBuilder();
            preOrder(root,str);
            return str.toString();
        }

        // Pre Order Method
        public void preOrder(TreeNode root,StringBuilder str) {
            if(root == null) {
                str.append("#,");
                return;
            }

            str.append(root.val).append(",");
            preOrder(root.left,str);
            preOrder(root.right,str);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] nodes = data.split(",");
            Queue<String> queue = new LinkedList<>(
                Arrays.asList(nodes)
            );
            return buildTree(queue);
        }
    
        // Build Tree Method
        public TreeNode buildTree(Queue<String> queue) {
            String value = queue.poll();
            
            if(value.equals("#")) {
                return null;
            }

            TreeNode root = new TreeNode(
                Integer.parseInt(value)
            );
            root.left = buildTree(queue);
            root.right = buildTree(queue);
            return root;
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] values = {
            1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1
        };
        
        // Create original tree
        TreeNode root = sol.insert(values);

        // Serialize
        String data = sol.serialize(root);

        System.out.println("Serialized Tree: " + data);

        // Deserialize
        TreeNode newRoot = sol.deserialize(data);

        // Serialize again to verify
        String result = sol.serialize(newRoot);
        System.out.println("Deserialized Tree: " + result);
        System.out.println("Are both same? " + data.equals(result));
    }
}
