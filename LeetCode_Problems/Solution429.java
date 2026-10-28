// Leetcode Problem 429 : N-ary Tree Level Order Traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {
     // Node class for N-ary Tree
    public static class Node {
        public int val;
        public List<Node> children;

        // Parameterized Constructor
        public Node(int x) {
            this.val = x;
            this.children = new ArrayList<>();
        }
    }

    // Function to print N-ary Tree preorder
    public static void printPreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        for (Node child : root.children) {
            printPreOrder(child);
        }
    }

    // Level Order Algorithm
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)  return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();

            for(int i=0; i<size;i++) {
                Node temp = queue.poll();
                list.add(temp.val);
                for(Node child : temp.children) {
                    queue.add(child);
                }
            }
            result.add(list);
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        // Create N-ary Tree
        Node root = new Node(1);

        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        // Print preorder
        System.out.print("Preorder Traversal: ");
        printPreOrder(root);
        System.out.println();
        // Get preorder list
        Solution429 obj =
                new Solution429();

        System.out.println("Level Order List: " + obj.levelOrder(root));
    }
}

