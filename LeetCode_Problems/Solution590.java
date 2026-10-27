// LeetCode Problem 589 : N-ary Tree Post order Traversal
import java.util.ArrayList;
import java.util.List;

public class Solution590 {

    // Node class for N-ary Tree
    public static class Node {
        int val;
        List<Node> children;

        // Parameterized Constructor
        Node(int x) {
            this.val = x;
            this.children = new ArrayList<>();
        }
    }

    // Function to print N-ary Tree postorder
    public static void printPreOrder(Node root) {
        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            printPreOrder(child);
        }

        System.out.print(root.val + " ");
    }

    // Preorder Method
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);

        for (Node child : root.children) {
            result.addAll(postorder(child));
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
        Solution590 obj =
                new Solution590();

        System.out.println("Postorder List: " + obj.postorder(root));
    }
}
