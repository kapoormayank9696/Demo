// LeetCode Problem 559 : Maximum Depth of N-ary Tree
import java.util.ArrayList;
import java.util.List;
public class Solution559 {

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

    // Maximum Depth Algorithm
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }

        int depth = 0;

        for (Node child : root.children) {
            depth = Math.max(depth, maxDepth(child));
        }

        return depth + 1;
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
        
        Solution559 obj =
                new Solution559();

        System.out.println("Maximum Depth of N-ary Tree: " + obj.maxDepth(root));
    }
}
